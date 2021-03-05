import models.LogEntry;
import models.LogNode;
import processor.LogProcessor;
import processor.LogProcessorImpl;
import tree.SegmentTree;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class Application {

  private static final Map<String, String> started = new HashMap<>();
  private static LogProcessor logProcessor = new LogProcessorImpl();

  private static void processFile(String path) {
    try {
      File file = new File(path);
      FileReader fileReader = new FileReader(file);
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      String line;
      while ((line = bufferedReader.readLine()) != null) {
        processStatement(line);
      }
      fileReader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String args[]) {
    //processFile("data/1.log");
    tree.SegmentTree.getNodeIndex("23:59:59");
    //tree.SegmentTree.getNodeIndex("16::59");
    // 0 - day
    // 1 - 24 - hours
    // 25 - 85 - 1st minute
    // 3625 - 1st second
    //SegmentTree.getNodeIndex("1:0:1");
  }

  private static void processStatement(String logStatement) {

//PROCESS_ID:THREAD_ID::THREAD_NAME LOGGED_TIME- LOG_MESSAGE
//e.g.
//8002:123145353711616::Thread-10 2020-08-09 18:59:25,264 - Starting new HTTPS connection (1)

    System.out.println(logStatement);
    try {

      String arr[] = logStatement.split(" ");

      System.out.println(logStatement.substring(0,4));
      String processThread = arr[0].split("::")[0];
      String processId = processThread.split(":")[0];
      String threadId = processThread.split(":")[1];

      String threadName = arr[0].split("::")[1];
      String date = arr[1];
      String timeStamp = arr[2].split(",")[0];

      String str = "2020-08-09 18:59:25";
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
      LocalDateTime dateTime = LocalDateTime.parse(str, formatter);

      logProcessor.process(new LogEntry(dateTime, new LogNode(processId, threadId, timeStamp)));

      System.out.println(new LogNode(processId, threadId, timeStamp));
    } catch (Exception e) {
      // ignoring those which don't follow the log pattern
      e.printStackTrace();
    }



  }

}

package tree;

import models.LogNode;

public class SegmentTree {


  // 24*60*60 + 1(Root node)
  // 24*60*60 + 60 + 24 + 1 = 86485
  private static int n = 86485;
  private static LogNode[] root = new LogNode[n];
  // 1-24 hour
  // 25- 85 - minutes of first hour
  // 87 - .. - minutes of second hour

  private static void construct()
  {
    root[0] = new LogNode();

    for (int i = 1; i <= 24; i++){
      LogNode logNode = new LogNode();
      root[i] = logNode;
    }

    for (int i = 25 ; i <= 86; i++){
      LogNode logNode = new LogNode();
      root[i] = logNode;
    }

  }

  //
  private static void query(String t1, String t2) {
    //0:0:0

    String[] arr = t1.split(":");
    int hour = Integer.parseInt(arr[0]);
    int minutes = Integer.parseInt(arr[1]);
    int seconds = Integer.parseInt(arr[2]);

    // 25 + hours*60
    // 25 + 60*60 + 1 + minutes*60


  }

  public static void getNodeIndex(String timeStamp) {
    //18:59:25
    String[] arr = timeStamp.split(":");
    int hour = Integer.parseInt(arr[0]);
    int minutes = Integer.parseInt(arr[1]);
    int seconds = Integer.parseInt(arr[2]);

    System.out.println(hour+1);
    System.out.println(25 + hour*60 + minutes);
    System.out.println(25 + 60*60 + hour*minutes*60 + seconds);

  }

}

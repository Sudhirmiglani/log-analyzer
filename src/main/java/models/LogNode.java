package models;

import java.util.HashSet;
import java.util.Set;

public class LogNode {

  String processId;
  String threadId;
  String timeStamp;

  Set<String> threads = new HashSet<>();

  public LogNode() {
  }

  public LogNode(String processId, String threadId, String timeStamp) {
    this.processId = processId;
    this.threadId = threadId;
    this.timeStamp = timeStamp;
  }

  @Override
  public String toString() {
    return "models.LogNode{" +
        "processId='" + processId + '\'' +
        ", threadId='" + threadId + '\'' +
        ", timeStamp='" + timeStamp + '\'' +
        '}';
  }
}

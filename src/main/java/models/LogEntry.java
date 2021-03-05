package models;

import java.time.LocalDateTime;

public class LogEntry {

  private LocalDateTime time;
  private LogNode node;

  public LogEntry(LocalDateTime time, LogNode node) {
    this.time = time;
    this.node = node;
  }

  public LocalDateTime getTime() {
    return time;
  }

  public void setTime(LocalDateTime time) {
    this.time = time;
  }

  public LogNode getNode() {
    return node;
  }

  public void setNode(LogNode node) {
    this.node = node;
  }
}

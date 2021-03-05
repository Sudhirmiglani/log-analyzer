package processor;

import models.LogEntry;

public interface LogProcessor {

  void process(LogEntry entry);

}

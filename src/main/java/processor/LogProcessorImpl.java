package processor;

import models.LogEntry;
import tree.SegmentTree;
import tree.ShardLocator;

public class LogProcessorImpl implements LogProcessor {


  @Override
  public void process(LogEntry entry) {

    SegmentTree segmentTree = ShardLocator.loadShard(entry.getTime());

  }
}

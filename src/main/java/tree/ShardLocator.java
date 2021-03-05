package tree;

import deserializer.DeSerializer;
import serializer.Serializer;

import java.io.IOException;
import java.time.LocalDateTime;

public class ShardLocator {

  // will return the particular file (Segment Tree) as per date
  public static SegmentTree loadShard(LocalDateTime dateTime) throws IOException {
    return DeSerializer.deserialize(dateTime);
  }

  public static void saveShard(LocalDateTime dateTime, SegmentTree segmentTree) throws IOException {
    Serializer.serialize(dateTime, segmentTree);
  }

}

package deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import tree.SegmentTree;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

public class DeSerializer {

  private static ObjectMapper objectMapper = new ObjectMapper();

  public static SegmentTree deserialize(LocalDateTime dateTime) throws IOException {
    return objectMapper.readValue(new File("shards/" + dateTime.toLocalDate().toString()), SegmentTree.class);
  }

}

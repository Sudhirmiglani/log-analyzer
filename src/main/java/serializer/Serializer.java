package serializer;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import tree.SegmentTree;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDateTime;

public class Serializer {

  private static ObjectMapper objectMapper = new ObjectMapper();

  public static void serialize(LocalDateTime localDateTime, SegmentTree data) throws IOException {
    ObjectWriter writer = objectMapper.writer(new DefaultPrettyPrinter());
    writer.writeValue(new File("shards/" + "2020/10/20.txt"), data);
  }

}

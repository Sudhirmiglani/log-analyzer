package serializer;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;

public class Serializer {

  private static ObjectMapper objectMapper = new ObjectMapper();

  public <T extends Serializable> void serialize(T data) {

  }

}

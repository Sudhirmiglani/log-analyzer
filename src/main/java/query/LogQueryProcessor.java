package query;

import java.time.LocalDateTime;

public interface LogQueryProcessor {

  <T> T query(LocalDateTime start, LocalDateTime end);

}

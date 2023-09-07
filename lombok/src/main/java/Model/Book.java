package Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// @AllArgsConstructor
// @NoArgsConstructor
// @Builder
// @Getter
// @Setter
// @ToString
// @EqualsAndHashCode
@Data // Getter Setter, ToString, Equals, HashCode, RequiredArgsConsturcotr
@AllArgsConstructor
@Builder

public class Book {
  
 private String author;
 private double weight;
}

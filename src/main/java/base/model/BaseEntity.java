package base.model;
import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BaseEntity<ID extends Serializable> {
 private ID id;
}

package model;
import base.model.BaseEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)
public class User extends BaseEntity {
    int id;
    String firstName;
    String lastName;
    String username;
    String password;


}

package model;

import base.model.BaseEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)

public class Basket extends BaseEntity<Integer> {
    int id;
    int userId;
    int productId;
    int basketCount;
    int basketPrice;
}

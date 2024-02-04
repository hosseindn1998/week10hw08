package model;

import base.model.BaseEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Product extends BaseEntity<Integer> {
    int id;
    String name;
    int price;
    int AvailableCount;
    int category_id;
}

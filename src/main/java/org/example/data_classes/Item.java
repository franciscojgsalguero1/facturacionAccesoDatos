package org.example.data_classes;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PUBLIC)
public class Item {
    int id;
    String code;
    String barCode;
    String description;
    int familyId;
    double cost;
    double margin;
    double price;
    int supplier;
    int stock;
    String notes;
}
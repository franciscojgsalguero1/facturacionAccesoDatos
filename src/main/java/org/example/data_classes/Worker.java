package org.example.data_classes;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PUBLIC)
public class Worker {
    int id;
    String name;
    String address;
    int postCode;
    String town;
    String province;
    String country;
    String dni;
    String phone;
    String email;
    String position;
    double salary;
    double commissionPercentage;
    String notes;
}
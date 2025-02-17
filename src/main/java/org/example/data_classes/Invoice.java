package org.example.data_classes;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.sql.Date;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PUBLIC)
public class Invoice {
    int id;
    int number;
    Date date;
    int clientId;
    double taxableAmount;
    double vatAmount;
    double totalAmount;
    String hash;
    String qrCode;
    boolean isPaid;
    int paymentMethod;
    Date paymentDate;
    String notes;
}
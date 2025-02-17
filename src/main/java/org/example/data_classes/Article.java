package org.example.data_classes;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PUBLIC)

public class Article {
    int idArticle;
    String codeArticle;
    String codigoBarrasArticle;
    String descripcionArticle;
    int familiaArticle;
    float costeArticle;
    float margenComercialArticle;
    float pvpArticle;
    int proveedorArticle;
    int stockArticle;
    String observacionesArticle;
}
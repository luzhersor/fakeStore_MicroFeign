package com.fakeStore.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductoDTO {

    private int id;
    private String title;
    private int price;
    private String description;
    private String category;
    //private String image;
    //Puede no contener todos los atributos de la API
}

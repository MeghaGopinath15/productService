package com.online.productservice.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class product
{
    private Long id;
    private String title;
    private String description;
    private double price;
    private Category category;
    private String imageUrl;

}

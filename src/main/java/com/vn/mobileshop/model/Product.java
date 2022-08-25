package com.vn.mobileshop.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer quantity;

    private Integer ram;

    private Integer storage;

    private Double price;

    private Double priceSale;

    private String color;

    private String img;

    private String imgThumb;

    private String description;

    private boolean status;

    @OneToOne
    private Brand brand;

    @OneToMany(mappedBy = "product" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private List<Review> reviews = new ArrayList<>();

}

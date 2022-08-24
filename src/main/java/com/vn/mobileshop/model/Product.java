package com.vn.mobileshop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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

    @OneToOne
    private Brand brand;

    private Integer quantity;

    private Integer storage;

    private Double price;

    private Double priceSale;

    private String color;

    private String img;

    private String imgThumb;

    private String description;

    private boolean status;

    @OneToMany(mappedBy = "idReview" , fetch = FetchType.LAZY)
    private List<Review> reviews;

}

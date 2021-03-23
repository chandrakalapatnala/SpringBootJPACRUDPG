package com.pgcrud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "PRODUCTS_TBL")
public class Product {
    @Id
    @GeneratedValue
    private int productId;

    private int quantity;

    private String productName;

    private double productPrice;


}

package com.pgcrud.repository;

import com.pgcrud.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    List<Product> findByProductName(String name);

    Product findByProductId(int id);
}

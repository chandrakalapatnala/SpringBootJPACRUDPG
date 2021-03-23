package com.pgcrud.service;

import com.pgcrud.entity.Product;
import com.pgcrud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product){
        return repository.save(product);
    }

    public List<Product> saveProducts(List<Product> products){

        return repository.saveAll(products);
    }

    public List<Product> getProducts(){
        return repository.findAll();
    }

    public Product getProductByID(int id){
        return repository.findByProductId(id);

    }

    public List<Product> getProductByName(String name){
        return repository.findByProductName(name);

    }

    public String deleteProduct(int id){
        repository.deleteById(id);
        return "product removed"+id;
    }

    public Product updateProduct(Product product){
        Product existingProduct = repository.findByProductId(product.getProductId());
        if(null!=existingProduct) {
            existingProduct.setProductName(product.getProductName());
            existingProduct.setProductPrice(product.getProductPrice());
            existingProduct.setQuantity(product.getQuantity());
        }
    return repository.save(existingProduct);
    }
}

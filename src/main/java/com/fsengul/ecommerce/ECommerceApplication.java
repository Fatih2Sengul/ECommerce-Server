package com.fsengul.ecommerce;

import com.fsengul.ecommerce.dao.ProductCategoryRepository;
import com.fsengul.ecommerce.dao.ProductRepository;
import com.fsengul.ecommerce.entity.Product;
import com.fsengul.ecommerce.entity.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ECommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ECommerceApplication.class, args);
    }

}

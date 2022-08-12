package com.fsengul.ecommerce.entity;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="product_category")
public class ProductCategory {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id")
        private Long id;

        @Column(name = "category_name")
        private String categoryName;

        @OneToMany(cascade = CascadeType.ALL, mappedBy = "category", fetch = FetchType.LAZY)
        private Set<Product> products;

        public ProductCategory(Long id, String categoryName, Set<Product> products) {
                this.id = id;
                this.categoryName = categoryName;
                this.products = products;
        }

        public ProductCategory() {}

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getCategoryName() {
                return categoryName;
        }

        public void setCategoryName(String categoryName) {
                this.categoryName = categoryName;
        }

        public Set<Product> getProducts() {
                return products;
        }

        public void setProducts(Set<Product> products) {
                this.products = products;
        }
}
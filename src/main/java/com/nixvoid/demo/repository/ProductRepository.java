package com.nixvoid.demo.repository;

import com.nixvoid.demo.entity.Category;
import com.nixvoid.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepository  extends JpaRepository<Product, Long> {

    public List<Product> findByCategory(Category category);
}

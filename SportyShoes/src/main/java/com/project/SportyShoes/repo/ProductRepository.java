package com.project.SportyShoes.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.SportyShoes.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
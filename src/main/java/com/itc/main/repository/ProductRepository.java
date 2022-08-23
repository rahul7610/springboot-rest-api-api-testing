package com.itc.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itc.main.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
//T  : It is domain type that repository manages like Entity/Model class name
//ID :  Type of id of the entity that repository manages
}

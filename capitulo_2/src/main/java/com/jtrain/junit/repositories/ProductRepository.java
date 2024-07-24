package com.jtrain.junit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jtrain.junit.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}

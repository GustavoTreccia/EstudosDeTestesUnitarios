package com.jtrain.junit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jtrain.junit.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}

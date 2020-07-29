package com.datagrupo.workshop.depositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datagrupo.workshop.entities.Category;
import com.datagrupo.workshop.entities.Product;

public interface ProductRepository  extends JpaRepository <Product, Long> {

}

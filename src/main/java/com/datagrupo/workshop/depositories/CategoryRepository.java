package com.datagrupo.workshop.depositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datagrupo.workshop.entities.Category;

public interface CategoryRepository  extends JpaRepository <Category, Long> {

}

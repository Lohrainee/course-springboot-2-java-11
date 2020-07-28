package com.datagrupo.workshop.depositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datagrupo.workshop.entities.Order;

public interface OrderRepository  extends JpaRepository <Order, Long> {

}

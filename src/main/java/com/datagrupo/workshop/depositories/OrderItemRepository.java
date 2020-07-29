package com.datagrupo.workshop.depositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datagrupo.workshop.entities.OrderItem;
import com.datagrupo.workshop.entities.User;

public interface OrderItemRepository  extends JpaRepository <OrderItem, Long> {

}

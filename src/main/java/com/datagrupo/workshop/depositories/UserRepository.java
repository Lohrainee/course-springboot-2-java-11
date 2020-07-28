package com.datagrupo.workshop.depositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datagrupo.workshop.entities.User;

public interface UserRepository  extends JpaRepository <User, Long> {

}

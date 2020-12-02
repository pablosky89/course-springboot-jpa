package com.pablosanhueza.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pablosanhueza.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

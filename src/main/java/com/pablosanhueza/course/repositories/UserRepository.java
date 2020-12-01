package com.pablosanhueza.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pablosanhueza.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

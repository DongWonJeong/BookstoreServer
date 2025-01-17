package com.sparta.bookstore.repository;

import com.sparta.bookstore.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

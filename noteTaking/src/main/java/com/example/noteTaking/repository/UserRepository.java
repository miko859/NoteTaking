package com.example.noteTaking.repository;

import com.example.noteTaking.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}


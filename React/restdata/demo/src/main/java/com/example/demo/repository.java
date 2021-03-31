package com.example.demo;

//import com.example.demo.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface repository extends JpaRepository<user,Long> {
    
}

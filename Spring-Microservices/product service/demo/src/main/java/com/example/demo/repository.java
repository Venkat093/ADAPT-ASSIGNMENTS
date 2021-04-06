package com.example.demo;


import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface repository extends MongoRepository<User,Long> {
    Optional<User> findByUserName(String username);
}

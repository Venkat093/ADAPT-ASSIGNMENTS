package com.example.productservice;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface repository extends MongoRepository<products,Long>{
    
}

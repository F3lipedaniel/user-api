package com.userapi.repository;

import com.userapi.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRespository extends MongoRepository<User, String> {
    Optional<User> findByName(String name);

}

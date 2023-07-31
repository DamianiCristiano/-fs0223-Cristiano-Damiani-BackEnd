package com.example.epicode.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.epicode.classes.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}

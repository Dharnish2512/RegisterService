package com.dharn.registerservice.repository;

import com.dharn.registerservice.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User findUserByEmail(String email);
    User findUserByUserId(int id);
}

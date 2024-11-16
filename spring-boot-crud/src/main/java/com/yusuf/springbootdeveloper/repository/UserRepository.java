package com.yusuf.springbootdeveloper.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yusuf.springbootdeveloper.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // No additional queries needed, JpaRepository provides CRUD operations
}

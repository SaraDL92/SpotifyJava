package com.spotify.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spotify.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {

}

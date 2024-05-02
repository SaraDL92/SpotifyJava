package com.spotify.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spotify.entity.Singer;

@Repository
public interface SingerRepo extends JpaRepository<Singer,Long> {

}

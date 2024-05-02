package com.spotify.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spotify.entity.Song;

@Repository
public interface SongRepo extends JpaRepository<Song,Long> {

}

package com.spotify.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spotify.entity.Playlist;

@Repository
public interface PlaylistRepo extends JpaRepository<Playlist,Long> {

}

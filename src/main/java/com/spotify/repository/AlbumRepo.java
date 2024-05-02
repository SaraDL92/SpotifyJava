package com.spotify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spotify.entity.Album;

public interface AlbumRepo extends JpaRepository<Album,Long> {

}

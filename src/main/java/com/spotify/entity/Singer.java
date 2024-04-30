package com.spotify.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Singer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idSinger;
	private String name;
	@ManyToMany
	@JoinTable(name="singer_song")
	private List<Song>songs;
	@OneToMany(mappedBy="singer")
	private List<Album>albums;
	public Long getIdSinger() {
		return idSinger;
	}
	public void setIdSinger(Long idSinger) {
		this.idSinger = idSinger;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Song> getSongs() {
		return songs;
	}
	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}
	public List<Album> getAlbums() {
		return albums;
	}
	public void setAlbums(List<Album> albums) {
		this.albums = albums;
	}
	
}

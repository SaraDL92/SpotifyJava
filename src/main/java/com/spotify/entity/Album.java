package com.spotify.entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.List;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
public class Album {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Long idalbum;
	private String title;
	private String img;
	private LocalDate date;
	@ManyToOne
	@JoinColumn(name="singer_id")
	private Singer singer;

	
	@ManyToMany(mappedBy="albums")
	private List<Song>songs;
	public Long getIdalbum() {
		return idalbum;
	}
	public void setIdalbum(Long idalbum) {
		this.idalbum = idalbum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Singer getSinger() {
		return singer;
	}
	public void setSinger(Singer singer) {
		this.singer = singer;
	}
	public List<Song> getSongs() {
		return songs;
	}
	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}
	
	
	

}

package com.spotify.entity;

import java.sql.Time;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="song")
public class Song {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id_song")
private Long idsong;
private String title;
private String img;
@ManyToMany
@JoinTable(name="album_song",joinColumns=@JoinColumn(name="id_album"),inverseJoinColumns=@JoinColumn(name="idsong"))
private List<Album>albums;
@ManyToMany(mappedBy="songs")
private List<Singer>singers;
private Time duration;

@ManyToMany
@JoinTable(name="playlist_song",joinColumns=@JoinColumn(name="id_playlist"),inverseJoinColumns=@JoinColumn(name="id_song"))

private List<Playlist>playlists;


public List<Album> getAlbums() {
	return albums;
}
public void setAlbums(List<Album> albums) {
	this.albums = albums;
}
public List<Singer> getSingers() {
	return singers;
}
public void setSingers(List<Singer> singers) {
	this.singers = singers;
}
public List<Playlist> getPlaylists() {
	return playlists;
}
public void setPlaylists(List<Playlist> playlists) {
	this.playlists = playlists;
}
public Long getIdsong() {
	return idsong;
}
public void setIdsong(Long idsinger) {
	this.idsong = idsinger;
}
public String getTitle() {
	return title;
}
public void setTitle(String name) {
	this.title= name;
}
public String getImg() {
	return img;
}
public void setImg(String img) {
	this.img = img;
}
public Time getDuration() {
	return duration;
}
public void setDuration(Time duration) {
	this.duration = duration;
}



}

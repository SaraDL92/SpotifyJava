package com.spotify.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Playlist {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long idplaylist;
private String title;
@ManyToMany(mappedBy="playlists")
private List<Song>songlist;
@ManyToMany
@JoinTable(name="user_playlist",joinColumns=@JoinColumn(name="id_user"),inverseJoinColumns=@JoinColumn(name="id_playlist"))
private List<User>users;
public Long getIdplaylist() {
	return idplaylist;
}
public List<Song> getSonglist() {
	return songlist;
}
public void setSonglist(List<Song> songlist) {
	this.songlist = songlist;
}
public List<User> getUsers() {
	return users;
}
public void setUsers(List<User> users) {
	this.users = users;
}
public void setIdplaylist(Long idplaylist) {
	this.idplaylist = idplaylist;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}


}

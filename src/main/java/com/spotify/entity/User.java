package com.spotify.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity

public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long iduser;
	private String username;
	private String password;
	private String birthday;
	private String type;
	@ManyToMany
	(mappedBy="users")
	private List<Playlist> playlists;
	@Column(name="creation_date")
	private LocalDate creationDate;
	@Column(name="last_edit_date")
	private LocalDate lastEditDate;
	public Long getIduser() {
		return iduser;
	}
	public void setIduser(Long iduser) {
		this.iduser = iduser;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public LocalDate getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	public LocalDate getLastEditDate() {
		return lastEditDate;
	}
	public void setLastEditDate(LocalDate lastEditDate) {
		this.lastEditDate = lastEditDate;
	}


}

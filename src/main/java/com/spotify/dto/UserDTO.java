package com.spotify.dto;

import java.time.LocalDate;
import java.util.List;

import com.spotify.entity.Playlist;

import jakarta.persistence.Column;
import jakarta.persistence.ManyToMany;

public class UserDTO {
	private Long iduserdto;
	private String usernamedto;
	private String passworddto;
	private String birthdaydto;
	private String typedto;
	
	private List<Long> playlistsdto;

	private LocalDate creationDatedto;
	
	private LocalDate lastEditDatedto;

	public Long getIduserdto() {
		return iduserdto;
	}

	public void setIduserdto(Long iduserdto) {
		this.iduserdto = iduserdto;
	}

	public String getUsernamedto() {
		return usernamedto;
	}

	public void setUsernamedto(String usernamedto) {
		this.usernamedto = usernamedto;
	}

	public String getPassworddto() {
		return passworddto;
	}

	public void setPassworddto(String passworddto) {
		this.passworddto = passworddto;
	}

	public String getBirthdaydto() {
		return birthdaydto;
	}

	public void setBirthdaydto(String birthdaydto) {
		this.birthdaydto = birthdaydto;
	}

	public String getTypedto() {
		return typedto;
	}

	public void setTypedto(String typedto) {
		this.typedto = typedto;
	}

	public List<Long> getPlaylistsdto() {
		return playlistsdto;
	}

	public void setPlaylistsdto(List<Long> playlistsdto) {
		this.playlistsdto = playlistsdto;
	}

	public LocalDate getCreationDatedto() {
		return creationDatedto;
	}

	public void setCreationDatedto(LocalDate creationDatedto) {
		this.creationDatedto = creationDatedto;
	}

	public LocalDate getLastEditDatedto() {
		return lastEditDatedto;
	}

	public void setLastEditDatedto(LocalDate lastEditDatedto) {
		this.lastEditDatedto = lastEditDatedto;
	}
	
	
}

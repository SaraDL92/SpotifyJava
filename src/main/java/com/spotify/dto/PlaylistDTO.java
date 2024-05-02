package com.spotify.dto;

import java.util.List;

import com.spotify.entity.Song;
import com.spotify.entity.User;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

public final class PlaylistDTO {
	private Long idplaylistdto;
	private String titledto;
	
	private List<Long>songlistdto;
	
	private List<Long>usersdto;

	public Long getIdplaylistdto() {
		return idplaylistdto;
	}

	public void setIdplaylistdto(Long idplaylistdto) {
		this.idplaylistdto = idplaylistdto;
	}

	public String getTitledto() {
		return titledto;
	}

	public void setTitledto(String titledto) {
		this.titledto = titledto;
	}

	public List<Long> getSonglistdto() {
		return songlistdto;
	}

	public void setSonglistdto(List<Long> songlistdto) {
		this.songlistdto = songlistdto;
	}

	public List<Long> getUsersdto() {
		return usersdto;
	}

	public void setUsersdto(List<Long> usersdto) {
		this.usersdto = usersdto;
	}
	
	
}

package com.spotify.dto;

import java.util.List;

import com.spotify.entity.Album;
import com.spotify.entity.Song;

import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

public class SingerDTO {
	private Long idSingerdto;
	private String namedto;
	
	private List<Long>songsdto;
	private List<Long>albumsdto;
	public Long getIdSingerdto() {
		return idSingerdto;
	}
	public void setIdSingerdto(Long idSingerdto) {
		this.idSingerdto = idSingerdto;
	}
	public String getNamedto() {
		return namedto;
	}
	public void setNamedto(String namedto) {
		this.namedto = namedto;
	}
	public List<Long> getSongsdto() {
		return songsdto;
	}
	public void setSongsdto(List<Long> songsdto) {
		this.songsdto = songsdto;
	}
	public List<Long> getAlbumsdto() {
		return albumsdto;
	}
	public void setAlbumsdto(List<Long> albumsdto) {
		this.albumsdto = albumsdto;
	}
	
	
}

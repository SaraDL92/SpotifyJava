package com.spotify.dto;

import java.sql.Time;
import java.util.List;

import com.spotify.entity.Album;
import com.spotify.entity.Playlist;
import com.spotify.entity.Singer;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

public class SongDTO {
	private Long idsongdto;
	private String titledto;
	private String imgdto;
	
	private List<Long>albumsdto;
	
	private List<Long>singersdto;
	private Time durationdto;

	

	private List<Long>playlistsdto;



	public Long getIdsongdto() {
		return idsongdto;
	}



	public void setIdsongdto(Long idsongdto) {
		this.idsongdto = idsongdto;
	}



	public String getTitledto() {
		return titledto;
	}



	public void setTitledto(String titledto) {
		this.titledto = titledto;
	}



	public String getImgdto() {
		return imgdto;
	}



	public void setImgdto(String imgdto) {
		this.imgdto = imgdto;
	}



	public List<Long> getAlbumsdto() {
		return albumsdto;
	}



	public void setAlbumsdto(List<Long> albumsdto) {
		this.albumsdto = albumsdto;
	}



	public List<Long> getSingersdto() {
		return singersdto;
	}



	public void setSingersdto(List<Long> singersdto) {
		this.singersdto = singersdto;
	}



	public Time getDurationdto() {
		return durationdto;
	}



	public void setDurationdto(Time durationdto) {
		this.durationdto = durationdto;
	}



	public List<Long> getPlaylistsdto() {
		return playlistsdto;
	}



	public void setPlaylistsdto(List<Long> playlistsdto) {
		this.playlistsdto = playlistsdto;
	}
	
	

}

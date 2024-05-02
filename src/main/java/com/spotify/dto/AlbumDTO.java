package com.spotify.dto;

import java.time.LocalDate;
import java.util.List;

import com.spotify.entity.Singer;
import com.spotify.entity.Song;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

public class AlbumDTO {

	private Long idalbumdto;
	private String titledto;
	private String imgdto;
	private LocalDate datedto;
	
	
	private Long singerdto;

	
	
	private List<Long>songsdto;



	public Long getIdalbumdto() {
		return idalbumdto;
	}



	public void setIdalbumdto(Long idalbumdto) {
		this.idalbumdto = idalbumdto;
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



	public LocalDate getDatedto() {
		return datedto;
	}



	public void setDatedto(LocalDate datedto) {
		this.datedto = datedto;
	}



	public Long getSingerdto() {
		return singerdto;
	}



	public void setSingerdto(Long singerdto) {
		this.singerdto = singerdto;
	}



	public List<Long> getSongsdto() {
		return songsdto;
	}



	public void setSongsdto(List<Long> songsdto) {
		this.songsdto = songsdto;
	}
	
	
}

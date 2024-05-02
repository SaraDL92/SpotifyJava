package com.spotify.utils.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spotify.dto.SingerDTO;
import com.spotify.entity.Album;
import com.spotify.entity.Singer;
import com.spotify.entity.Song;
import com.spotify.repository.AlbumRepo;
import com.spotify.repository.SongRepo;

@Component
public class SingerConverter {
	@Autowired
	AlbumRepo albumrepo;
	@Autowired
	SongRepo songrepo;
	public Singer toEntity(SingerDTO singerDTO) 
	{
		Singer singer=new Singer();
		singer.setIdSinger(singerDTO.getIdSingerdto());
		singer.setName(singerDTO.getNamedto());
		List<Album>albums=new ArrayList<>();
		if(albums!=null) {
		for(Long i:singerDTO.getAlbumsdto()) {
			Album album=albumrepo.findById(i).get();
			albums.add(album);
		}}
		singer.setAlbums(albums);
		List<Song>songs=new ArrayList<>();
		if(songs!=null) {
		for(Long x:singerDTO.getSongsdto()) {Song s=songrepo.findById(x).get();
		songs.add(s);}}
		singer.setSongs(songs);
		return singer;
	}
	public SingerDTO toDTO(Singer singer) 
	{SingerDTO singerdto=new SingerDTO();
	singerdto.setIdSingerdto(singer.getIdSinger());
	singerdto.setNamedto(singer.getName());
	List<Long>albums=new ArrayList<>();
	if(albums!=null) {
	for(Album m:singer.getAlbums()) {Long x=m.getIdalbum();
	albums.add(x);}}
	singerdto.setAlbumsdto(albums);
	List<Long>songs=new ArrayList<>();
	if(songs!=null) {
	for(Song s:singer.getSongs()) {Long x=s.getIdsong();
	songs.add(x);}}
	singerdto.setSongsdto(songs);
	return singerdto;
		
	}

}

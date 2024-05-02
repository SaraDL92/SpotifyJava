package com.spotify.utils.converter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spotify.dto.AlbumDTO;
import com.spotify.dto.SongDTO;
import com.spotify.entity.Album;
import com.spotify.entity.Singer;
import com.spotify.entity.Song;
import com.spotify.repository.AlbumRepo;
import com.spotify.repository.SingerRepo;
import com.spotify.repository.SongRepo;

@Component
public class AlbumConverter {
	
	@Autowired
	SongRepo songrepo;
	@Autowired
	SingerRepo singerrepo;
	
	public AlbumDTO toDTO(Album album) 
	{AlbumDTO albumdto=new AlbumDTO();
	albumdto.setDatedto(album.getDate());
	albumdto.setIdalbumdto(album.getIdalbum());
	albumdto.setImgdto(album.getImg());
	albumdto.setSingerdto(album.getSinger().getIdSinger());
	List<Long>songs=new ArrayList<Long>();
	if(songs!=null) {
	for(Song s:album.getSongs()) {Long x=s.getIdsong();
	songs.add(x);}}
	
	albumdto.setSongsdto(songs);
	albumdto.setTitledto(album.getTitle());
	return albumdto;
		
		
	
		
		
	}
	
	public Album toEntity(AlbumDTO albumdto) 
	{
		Album album=new Album();
		album.setDate(albumdto.getDatedto());
		album.setIdalbum(albumdto.getIdalbumdto());
		album.setImg(albumdto.getImgdto());
		Singer singer=singerrepo.findById(albumdto.getSingerdto()).get();
		album.setSinger(singer);
		List<Song>listacanzoni=new ArrayList<>();
		if(listacanzoni!=null) {
		for(Long l:albumdto.getSongsdto()) {Song song=songrepo.findById(l).get();
		listacanzoni.add(song);}}
		album.setSongs(listacanzoni);
		album.setTitle(albumdto.getTitledto());
		return album;
	}

}

package com.spotify.utils.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spotify.dto.AlbumDTO;
import com.spotify.dto.SongDTO;
import com.spotify.entity.Album;
import com.spotify.entity.Playlist;
import com.spotify.entity.Singer;
import com.spotify.entity.Song;
import com.spotify.repository.AlbumRepo;
import com.spotify.repository.PlaylistRepo;
import com.spotify.repository.SingerRepo;

@Component
public class SongConverter {
	
	@Autowired
	AlbumRepo alrepo;
	@Autowired
	PlaylistRepo psrepo;
	@Autowired
	SingerRepo srepo;

	public Song toEntity(SongDTO songdto) 
	{
		Song s=new Song();
		List<Album> albums=new ArrayList<>();
		if(albums!=null) {
		for(Long album:songdto.getAlbumsdto()) 
		{
			Album a=alrepo.findById(album).get();
			albums.add(a);
		}}
		s.setAlbums(albums);
		s.setDuration(songdto.getDurationdto());
		s.setIdsong(songdto.getIdsongdto());
		s.setImg(songdto.getImgdto());
		List<Playlist> pss=new ArrayList<>();
		if(pss!=null) {
		for(Long ps:songdto.getPlaylistsdto()) 
		{
			Playlist a=psrepo.findById(ps).get();
			pss.add(a);
		}}
		s.setPlaylists(pss);
		List<Singer> singers=new ArrayList<>();
		if(singers!=null) {
		for(Long singer:songdto.getSingersdto()) 
		{
			Singer a=srepo.findById(singer).get();
			singers.add(a);
		}}
		s.setSingers(singers);
		s.setTitle(songdto.getTitledto());
		return s;
	}
	
	public SongDTO toDTO(Song song) 
	{
		SongDTO songdto=new SongDTO();
		List<Long> albums=new ArrayList<>();
		if(albums!=null) {
		for(Album album:song.getAlbums()) 
		{
			Long a=album.getIdalbum();
			albums.add(a);
		}}
		songdto.setAlbumsdto(albums);
		songdto.setDurationdto(song.getDuration());
		songdto.setIdsongdto(song.getIdsong());
		songdto.setImgdto(song.getImg());
		List<Long> playlists=new ArrayList<>();
		if(playlists!=null) {
		for(Playlist ps:song.getPlaylists()) 
		{
			Long a=ps.getIdplaylist();
			playlists.add(a);
		}
		}
		songdto.setPlaylistsdto(playlists);
		List<Long> singers=new ArrayList<>();
		if(singers!=null) {
		for(Singer s:song.getSingers()) 
		{
			Long a=s.getIdSinger();
			singers.add(a);
		}}
		songdto.setSingersdto(singers);
		songdto.setTitledto(song.getTitle());
		return songdto;
	}
	
	
}

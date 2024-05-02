package com.spotify.utils.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spotify.dto.PlaylistDTO;
import com.spotify.entity.Playlist;
import com.spotify.entity.Song;
import com.spotify.entity.User;
import com.spotify.repository.SongRepo;
import com.spotify.repository.UserRepo;

@Component
public class PlaylistConverter {
	
	@Autowired
	SongRepo songrepo;
	@Autowired
	UserRepo userrepo;
	
	
	public Playlist toEntity(PlaylistDTO psdto) 
	{
		Playlist ps=new Playlist();
		ps.setIdplaylist(psdto.getIdplaylistdto());
		ps.setTitle(psdto.getTitledto());
		List<Song>songs=new ArrayList<>();
		if(songs!=null) {
		for(Long s:psdto.getSonglistdto()) {Song ss=songrepo.findById(s).get();
		songs.add(ss);}}
		ps.setSonglist(songs);
		List<User>users=new ArrayList<>();
		if(users!=null) {
		for(Long u:psdto.getUsersdto()) {User us=userrepo.findById(u).get();
		users.add(us);}}
		ps.setUsers(users);
		return ps;
	}
	
	
	public PlaylistDTO toDTO(Playlist ps) 
	{
		PlaylistDTO playlistdto=new PlaylistDTO();
		playlistdto.setIdplaylistdto(ps.getIdplaylist());
		playlistdto.setTitledto(ps.getTitle());
		List<Long>songs=new ArrayList<>();
		if(songs!=null) {
		for(Song i:ps.getSonglist()) {Long x=i.getIdsong();
		songs.add(x);}}
		playlistdto.setSonglistdto(songs);
		List<Long>users=new ArrayList<>();	
		if(users!=null) {
		for(User u:ps.getUsers()) {Long x=u.getIduser();users.add(x);}}
		playlistdto.setUsersdto(users);
		return playlistdto;
		
	}

}

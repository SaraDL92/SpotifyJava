package com.spotify.utils.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spotify.dto.UserDTO;
import com.spotify.entity.Playlist;
import com.spotify.entity.User;
import com.spotify.repository.PlaylistRepo;

@Component
public class UserConverter {

	@Autowired
	PlaylistRepo playrepo;
	
	public User toEntity(UserDTO userdto) {
		User user=new User();
		user.setBirthday(userdto.getBirthdaydto());
		user.setCreationDate(userdto.getCreationDatedto());
		user.setIduser(userdto.getIduserdto());
		user.setLastEditDate(userdto.getLastEditDatedto());
		user.setPassword(userdto.getPassworddto());
		user.setType(userdto.getTypedto());
		user.setUsername(userdto.getUsernamedto());
		
		List<Playlist>lista=new ArrayList<>();
		if(lista!=null) {
		for(Long x:userdto.getPlaylistsdto()) {
			Playlist ps=playrepo.findById(x).get();
			lista.add(ps);
		}}
		user.setPlaylists(lista);
		return user;
	}
	
	public UserDTO toDTO(User user) {
		
		UserDTO userdto=new UserDTO();
		userdto.setBirthdaydto(user.getBirthday());
		userdto.setCreationDatedto(user.getCreationDate());
		userdto.setIduserdto(user.getIduser());
		userdto.setLastEditDatedto(user.getLastEditDate());
		userdto.setPassworddto(user.getPassword());
		List<Long>pss=new ArrayList<>();
		if(pss!=null) {
		for(Playlist p:user.getPlaylists()) {
			Long x=p.getIdplaylist();
			pss.add(x);
		}}
		userdto.setPlaylistsdto(pss);
		userdto.setTypedto(user.getType());
		userdto.setUsernamedto(user.getUsername());
		return userdto;
	}
	
}

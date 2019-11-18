package com.destoroyah.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.destoroyah.model.Video;

import com.destoroyah.repo.VideoDao;

@Service
public class VideoService {
	
	private VideoDao pd;
	
	VideoDao phd;
	
	public void insertVideo(Video p) {
		pd.insert(p);
	}
	
	public List<Video> getAll(){
		return pd.findAll();
	}
		
	public VideoDao getPd() {
		return pd;
	}

	@Autowired
	public void setPd(VideoDao pd) {
		this.pd = pd;
	}
	
public List<Video> findAll() {
		
		return phd.findAll(); 

	}

}

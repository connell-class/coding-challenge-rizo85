package com.destoroyah.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.destoroyah.model.Video;

import com.destoroyah.service.VideoService;

@Controller
@RequestMapping(value="/video")
@CrossOrigin(origins="*")
public class VideoController {

	private VideoService video;
	
	VideoService phs;
	
	@RequestMapping(value="/videoIn.app", method = RequestMethod.POST)
	public @ResponseBody Video insert(@RequestBody Video p) {
		
		video.insertVideo(p);
		return p;
	}
	
//	@GetMapping(value="getAll.app")
//	public ResponseEntity<List<Post>> getAll(){
//		return new ResponseEntity<List<Post>>(post.getAll(), HttpStatus.OK);
//	}
	
	@RequestMapping(value="/getAll.app", method=RequestMethod.POST)
	public @ResponseBody List<Video> getAll(){

		return phs.findAll();
		}
	

	
	public VideoService getVideo() {
		return video;
	}

	@Autowired
	public void setVideo(VideoService video) {
		this.video = video;
	}





}

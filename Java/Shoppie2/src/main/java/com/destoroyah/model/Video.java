package com.destoroyah.model;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="video")
public class Video {


	@Id
	@Column(name="video_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int video_id;
	
	@Column(name="videoname")
	private String videoname;
	
	@Column(name="videocode")
	private String videocode;

	public int getVideo_id() {
		return video_id;
	}

	public void setVideo_id(int video_id) {
		this.video_id = video_id;
	}

	public String getVideoname() {
		return videoname;
	}

	public void setVideoname(String videoname) {
		this.videoname = videoname;
	}

	public String getVideocode() {
		return videocode;
	}

	public void setVideocode(String videocode) {
		this.videocode = videocode;
	}

	
	

	
}

package com.lti.model;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="TBL_Song")
public class Song {
	@Id
	@GeneratedValue
	private int id;
	@Column(name="Song_title")
	private String title;
	@Column(name="Song_duration")
	private double duration;
	@Column(name="Song_artist")
	private String artist;
	@ManyToOne
	@JoinColumn(name="Album_ID", nullable=false)
	private Album album;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public Album getAlbum() {
		return album;
	}
	public void setAlbum(Album album) {
		this.album = album;
	}

}

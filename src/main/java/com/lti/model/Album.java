package com.lti.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="TBL_Album")
public class Album {
	@Id
	@GeneratedValue
	private int id;
	@Column(name="Album_Name")
	private String name;
	@Column(name="Album_releaseDate")
	private LocalDate releaseDate;
	@Column(name="Album_genre")
	private String genre;
	@OneToMany(mappedBy="album",cascade=CascadeType.ALL)
	private List<Song> songs;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public List<Song> getSongs() {
		return songs;
	}

	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}
	
	
}

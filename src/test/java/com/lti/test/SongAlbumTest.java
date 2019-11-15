package com.lti.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.lti.dao.GenericDao;
import com.lti.model.Album;
import com.lti.model.Song;

public class SongAlbumTest {
	
	@Test
	public void add(){
		
		Album album=new Album();
		album.setName("Baazigar");
		album.setGenre("Rock");
		album.setReleaseDate(LocalDate.of(1999, 6, 14));
		GenericDao dao=new GenericDao();
		dao.insert(album);
			
		}
	@Test
	public void AddSongToAlbum(){
		
		GenericDao dao=new GenericDao();
		Album alb=(Album) dao.fetchById(Album.class, 241);
		Song song=new Song();
		song.setTitle("Kaali Kaali Ankhen");
		song.setArtist("Kumar Sanu");
		song.setDuration(4.3);
		song.setAlbum(alb);
		dao.insert(song);
		
		
	}
@Test
public void addAlbumAlongwithSongs(){
	
	GenericDao dao=new GenericDao();
	Album album=new Album();
	album.setGenre("Classics");
	album.setName("Old Songs");
	album.setReleaseDate(LocalDate.of(2007, 11, 23));
	
	Song song=new Song();
	song.setArtist("R.D. Barman");
	song.setDuration(4.00);
	song.setTitle("Balma");
	song.setAlbum(album);
	
	Song song1=new Song();
	song1.setArtist("Kishore Kumar ");
	song1.setDuration(4.00);
	song1.setTitle("Mere Samne Waali Khidki");
	song1.setAlbum(album);
	
	Song song2=new Song();
	song2.setArtist("Kishore Kumar");
	song2.setDuration(4.00);
	song2.setTitle("Ek Chaturnaar Karke Shringaar");
	song2.setAlbum(album);
	
	Song song3=new Song();
	song3.setArtist("Diler Mehndi");
	song3.setDuration(4.00);
	song3.setTitle("Bolo Tara Rara");
	song3.setAlbum(album);
	
	List<Song> s = new ArrayList<Song>();
	s.add(song);
	s.add(song1);
	s.add(song2);
	s.add(song3);
	album.setSongs(s);
	dao.insert(album);
	
}
}

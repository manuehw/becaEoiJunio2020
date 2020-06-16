package edu.es.eoi;

import edu.es.eoi.domain.Film;
import edu.es.eoi.domain.Serie;
import edu.es.eoi.domain.Song;
import edu.es.eoi.interfaces.Playable;
import edu.es.eoi.service.PlayService;

public class App {
	
	public static Playable[] playList= new Playable[10];

	public static void main(String[] args) {
							
		Playable play= new Film();
		((Film)play).getName();
		
		Film film= new Film();
		Serie serie= new Serie();
		Song song= new Song();
		
		addToPlaylist(film);
		addToPlaylist(serie);
		addToPlaylist(song);
		
		PlayService.play(playList);
		
	}
	
	public static void addToPlaylist(Playable playable) {		
		for (int i = 0; i < playList.length; i++) {
			  if(playList[i]==null) {
				  playList[i]=playable;
				  return;
			  }
		}		
	}

}

package edu.es.eoi;

import edu.es.eoi.domain.Film;
import edu.es.eoi.domain.Serie;
import edu.es.eoi.domain.Song;
import edu.es.eoi.interfaces.Playable;
import edu.es.eoi.service.PlayService;

public class App {

	public static void main(String[] args) {
			
		Playable play= new Film();
		((Film)play).getName();
		
		Film film= new Film();
		Serie serie= new Serie();
		Song song= new Song();
		
		PlayService.play(film);
		PlayService.play(serie);
		PlayService.play(song);
	
	

	}

}

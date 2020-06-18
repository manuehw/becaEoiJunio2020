package edu.es.eoi;

import edu.es.eoi.controller.FilmController;
import edu.es.eoi.controller.PersonController;
import edu.es.eoi.controller.PlayController;
import edu.es.eoi.domain.Film;
import edu.es.eoi.domain.Serie;
import edu.es.eoi.domain.User;
import edu.es.eoi.interfaces.Playable;
import edu.es.eoi.repository.FilmRepository;
import edu.es.eoi.service.FilmService;
import edu.es.eoi.service.PersonService;
import edu.es.eoi.service.PlayService;
import edu.es.eoi.view.MenuView;

public class App {
	
	public static Playable[] films= new Film[1000];
	public static Playable[] series= new Serie[1000];
	public static User[] users= new User[50];
	public static PlayService playService= new PlayService();
	public static PlayController playController= new PlayController(playService);
	public static FilmRepository filmRepository= new FilmRepository();
	public static FilmService filmService= new FilmService(filmRepository);
	public static FilmController filmController= new FilmController(filmService);	

	public static void main(String[] args) {	
		createPlayOffer();
		MenuView.printMenu();		
	}
	
	public static void createPlayOffer() {		
		
		Film film1= new Film();
		film1.setName("La Jungla de cristal 1");
		Film film2= new Film();
		film2.setName("La Jungla de cristal 2");
		Film film3= new Film();
		film3.setName("La Jungla de cristal 3");
		Film film4= new Film();
		film4.setName("La Jungla de cristal 4");
		
		filmController.addFilm(film1);
		filmController.addFilm(film2);
		filmController.addFilm(film3);
		filmController.addFilm(film4);
		
	}

}

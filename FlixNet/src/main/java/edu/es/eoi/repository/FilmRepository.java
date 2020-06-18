package edu.es.eoi.repository;

import edu.es.eoi.App;
import edu.es.eoi.domain.Film;

public class FilmRepository {
	
	//Create Read Update Delete	
	public void create(Film film) {
		for (int i = 0; i < App.films.length; i++) {
			if(App.films[i]==null) {
				App.films[i]=film;
				break;
			}
		}
	}	
	
	public Film read(String name) {		
		Film film=null;		
		for (int i = 0; i < App.films.length; i++) {
			if(App.films[i]!=null&&
			   ((Film)App.films[i]).getName().equals(name)) {
				film=(Film)App.films[i];
			}
		}		
		return film;
	}	
	
	public void update(Film film) {
		for (int i = 0; i < App.films.length; i++) {
			if(App.films[i]!=null&&
			   ((Film)App.films[i]).equals(film)) {
				film=(Film)App.films[i];
			}
		}	
	}
	
	public void delete(Film film) {
		for (int i = 0; i < App.films.length; i++) {
			if(App.films[i]!=null&&
			   ((Film)App.films[i]).equals(film)) {
				 App.films[i]=null;
			}
		}	
	}
	

}

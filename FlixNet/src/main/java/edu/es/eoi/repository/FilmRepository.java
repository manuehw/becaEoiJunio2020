package edu.es.eoi.repository;

import java.util.Map;

import edu.es.eoi.App;
import edu.es.eoi.domain.Film;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class FilmRepository {

	private Map<String,Film> films;
	
	public void create(Film film) {	
		App.films.put(film.getName(), film);
	}	
	
	public Film read(String name) {			
		return App.films.get(name);
	}	
	
	public void update(Film film) {		
		App.films.put(film.getName(), film);
	}
	
	public void delete(Film film) {
		App.films.remove(film.getName());
	}	
	
	public Map<String,Film> readAll(){
		return App.films;
	}
}

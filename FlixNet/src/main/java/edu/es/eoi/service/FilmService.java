package edu.es.eoi.service;

import java.util.Map;

import edu.es.eoi.domain.Film;
import edu.es.eoi.domain.User;
import edu.es.eoi.domain.Wishlist;
import edu.es.eoi.repository.FilmRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class FilmService {
	
	private FilmRepository repository;
				
	public Film findByName(String name) {
		return repository.read(name);
	}		
	
	public Map<String,Film> findAll(){
		return repository.readAll();
	}
	
	public void valorate(Film film, String opinion) {
		film.getOpinions().add(opinion);
		repository.update(film);
	}
	
	public Map<String,Film> viewRecomendations(User user){		
		return repository.readAll();
	}
	
	public void addToWishlist(Wishlist list, Film film) {
		list.getMyList().add(film);
	}

}

package edu.es.eoi.service;

import java.util.Map;

import edu.es.eoi.domain.Serie;
import edu.es.eoi.repository.SerieRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class SerieService {
	
	private SerieRepository repository;
	
	public void addSerie(Serie film) {			
		repository.create(film);
	}
	
	public Serie findByName(String name) {
		return repository.read(name);
	}
	
	public void remove(Serie film) {
		repository.delete(film);
	}
	
	public void updateSerie(Serie film) {
		repository.update(film);
	}
	
	public Map<String,Serie> findAll(){
		return repository.readAll();
	}

}

package edu.es.eoi.repository;

import java.util.Map;

import edu.es.eoi.App;
import edu.es.eoi.domain.Serie;

public class SerieRepository {

	public void create(Serie serie) {	
		App.series.put(serie.getName(), serie);
	}	
	
	public Serie read(String name) {			
		return App.series.get(name);
	}	
	
	public void update(Serie serie) {		
		App.series.put(serie.getName(), serie);
	}
	
	public void delete(Serie serie) {
		App.series.remove(serie.getName());
	}	
	
	public Map<String,Serie> readAll(){
		return App.series;
	}
}

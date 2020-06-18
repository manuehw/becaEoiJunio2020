package edu.es.eoi.repository;

import edu.es.eoi.App;
import edu.es.eoi.domain.Serie;
import edu.es.eoi.interfaces.Playable;

public class SerieRepository {

	public void create(Serie serie) {	
		App.series.add(serie);		
	}	
	
	public Serie read(String name) {		
		Serie serie = null;
		for (Playable temp : App.series) {
			if(((Serie)temp).getName().equals(name)) {
				serie=(Serie) temp;
			}
		}		
		return serie;
	}	
	
	public void update(Serie serie) {		
		for (Playable temp : App.series) {
			if(((Serie)temp).equals(serie)) {
				serie=(Serie) temp;
			}
		}
	}
	
	public void delete(Serie serie) {
		App.series.remove(serie);
	}	
}

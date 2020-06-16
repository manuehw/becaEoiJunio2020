package edu.es.eoi.domain;

import edu.es.eoi.interfaces.Playable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Serie implements Playable {

	private Category category;
	private String name;
	private String year;
	private Season[] season;
	private Actor[] actors;
	private Producer[] producers;

	@Override
	public void play() {
		System.out.println("Soy un serie y me pongo en reproduccion");
	}
	
}

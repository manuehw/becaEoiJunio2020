package edu.es.eoi.domain;

import edu.es.eoi.interfaces.Playable;

public class Song implements Playable {

	@Override
	public void play() {
		System.out.println("soy una cancion y me reproduzco");
	}

}

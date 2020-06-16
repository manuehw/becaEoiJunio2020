package edu.es.eoi.service;

import edu.es.eoi.interfaces.Playable;

public class PlayService {
	
	public static void play(Playable playable) {
		playable.play();
	}
	
	public static void play(Playable[] playList) {		
		for (int i = 0; i < playList.length; i++) {
			if(playList[i]!=null) {
				play(playList[i]);
			}			
		}	
	}

}

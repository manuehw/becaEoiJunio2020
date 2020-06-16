package edu.es.eoi.controller;

import edu.es.eoi.interfaces.Playable;
import edu.es.eoi.service.PlayService;
import edu.es.eoi.view.MenuView;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class PlayController {
	
	private PlayService service;
	
	public void play(Playable playable) {
		PlayService.play(playable);
		MenuView.printMenu();
	}

}

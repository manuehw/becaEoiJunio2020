package edu.es.eoi;

import edu.es.eoi.interfaces.Playable;
import edu.es.eoi.view.MenuView;

public class App {
	
	public static Playable[] playList= new Playable[10];

	public static void main(String[] args) {
	
		createPlayOffer();
		MenuView.printMenu();
		
	}
	
	public static void createPlayOffer() {		
		//create list 
	}
	
	public static void addToPlaylist(Playable playable) {		
		for (int i = 0; i < playList.length; i++) {
			  if(playList[i]==null) {
				  playList[i]=playable;
				  return;
			  }
		}		
	}

}

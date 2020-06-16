package edu.es.eoi.view;

import java.util.Scanner;

import edu.es.eoi.App;
import edu.es.eoi.domain.Film;

public class MenuView {
	
	public static void printMenu() {
	
		System.out.println("**********************");
		System.out.println("*BIENVENIDO A FLIXNET*");
		System.out.println("**********************");
		System.out.println("¿QUE QUIERES VER HOY?");
		System.out.println("**********************");
		System.out.println("");
		
		for (int i = 0; i < App.playList.length; i++) {
			if(App.playList[i]!=null){
				//TODO cambiar casting
				System.out.println(i+"-"+((Film)App.playList[i]).getName());
			}
		}
		
		@SuppressWarnings("resource")
		Scanner scanner= new Scanner(System.in);
		int opcion=scanner.nextInt();
		
		App.controller.play(App.playList[opcion]);
		
		MenuView.printMenu();
		
	}

}

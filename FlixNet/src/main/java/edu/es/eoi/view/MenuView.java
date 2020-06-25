package edu.es.eoi.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
			
		Map<String, Film> peliculas = App.filmController.findAll();	
				
		int i=0;
		for (String titulo : peliculas.keySet()) {
			System.out.println((i)+" - " + titulo);
			i++;
		}
		
		List<Film> peliculasList=new ArrayList<Film>();
		peliculasList.addAll(peliculas.values());
		
		@SuppressWarnings("resource")
		Scanner scanner= new Scanner(System.in);
		int opcion=scanner.nextInt();
		
		App.filmController.play("PEPE");
		
//		App.filmController.play(peliculasList.get(opcion).getName());
		
		MenuView.printMenu();
		
	}

}

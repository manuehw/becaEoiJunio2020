package edu.es.eoi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import edu.es.eoi.service.ProductoService;

public class Main {

	public static Product[] content = new Product[200];
	public final static Double NUMERO_PI = 3.14;

	public static void main(String[] args) {

		Product product1 = new Computer(1, "HP", "descripcion", "Windows", 800);
		Product product2 = new Television(1, "TV", "descripcion", 42, 500);

		ProductoService.printProduct(product1);
		ProductoService.printProduct(product2);

		System.out.println(product1.calculatePrice() + "€");
		System.out.println(product2.calculatePrice() + "€");

		// Autoboxing y unboxing
		int a = 0;
		double numero = 5.0;
		boolean condicion = false;

		Integer entero = a;
		int b = entero;

		System.out.println(entero.toString());

		String hola = "hola pepe";

		if (hola.contains("i") || hola.contains("b") || hola.contains("c")) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		Pattern pattern= Pattern.compile("[abc]");
		Matcher matcher= pattern.matcher(hola);		
		if(matcher.find()) {
			System.out.println("Si que se encuentra");
		}

	}

}

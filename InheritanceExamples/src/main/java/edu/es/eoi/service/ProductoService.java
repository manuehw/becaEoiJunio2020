package edu.es.eoi.service;

import edu.es.eoi.Prizable;
import edu.es.eoi.Product;

public class ProductoService {
	
	public static void printProduct(final Product product) {
		
		System.out.println(product);				
	}
	
	public static void printProduct(final Product product, boolean isTrue) {
		
		System.out.println(product);	
		
	}
	
	public void getTaxes(Prizable prizable) {
		
	}	

}

package edu.es.eoi;

import edu.es.eoi.service.ProductoService;

public class Main {
	
	public static Product[] content=new Product[200];
	public final static Double NUMERO_PI=3.14;
	
	public static void main(String[] args) {

		Product product1 = new Computer(1, "HP", "descripcion","Windows",800);
		Product product2 = new Television(1, "TV", "descripcion",42,500);
				
		ProductoService.printProduct(product1);	
		ProductoService.printProduct(product2);
			
		System.out.println(product1.calculatePrice()+"€");
		System.out.println(product2.calculatePrice()+"€");
		
		Prizable p=product1;
		Computer c=(Computer) product1;
		Product pr=product1;
		Object o=product1;
		
	}

}

package edu.es.eoi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public abstract class Product implements Prizable {
	
	private Integer id;
	
	private String name;
	
	private String description;
	
	private double price;
	
	public abstract double calculatePrice();

	
		
}

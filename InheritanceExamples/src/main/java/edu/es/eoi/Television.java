package edu.es.eoi;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class Television extends Product{
	
	private Person person;
	
	public Television(Integer id, String name, String description, double price) {
		super(id, name, description, price);	
	}

	private Integer size;

	public Television(Integer id, String name, String description, Integer size, double price) {
		super(id, name, description, price);
		this.size = size;
	}

	@Override
	public double calculatePrice() {	
		return this.getPrice()*1.10;
	}

	
}

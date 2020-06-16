package edu.es.eoi;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public final class Television extends Product{

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

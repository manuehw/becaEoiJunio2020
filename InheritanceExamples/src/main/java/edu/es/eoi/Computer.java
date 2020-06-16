package edu.es.eoi;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public final class Computer extends Product {

	public Computer(Integer id, String name, String description, double price) {
		super(id, name, description, price);
	}

	private String operativeSystem;

	public Computer(Integer id, String name, String description, String operativeSystem, double price) {
		super(id, name, description, price);
		this.operativeSystem = operativeSystem;
	}

	@Override
	public double calculatePrice() {
		
		return this.getPrice()*1.10;
	}

}

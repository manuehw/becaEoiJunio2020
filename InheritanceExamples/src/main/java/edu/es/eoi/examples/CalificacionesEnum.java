package edu.es.eoi.examples;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public enum CalificacionesEnum {
		
	SOBRESALIENTE(9,10),
	NOTABLE(7,8),
	BIEN(6,6),
	SUFICIENTE(4,5),
	INSUFICIENTE(0,3);

	private int valorMin;
	private int valorMax;
	
}

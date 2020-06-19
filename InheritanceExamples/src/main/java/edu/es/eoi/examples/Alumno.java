package edu.es.eoi.examples;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {

	private String nombre;	
	private CalificacionesEnum calificacion;	
	private Double nota;	

}

package edu.es.eoi.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class EnumExample {

	public static void main(String[] args) {
		
		List<Alumno> alumnos= new ArrayList<Alumno>();
		
		for (int i = 0; i < 10; i++) {
			Alumno a= new Alumno();
			a.setNombre("Alumno".concat(String.valueOf(i+1)));	
			alumnos.add(a);
		}
		
//		alumnos.stream().forEach(a->System.out.println(a.getNombre()));
	
		for (Alumno alumno : alumnos) {
			Integer nota=new Random().nextInt(10);			
			
			if(nota.equals(CalificacionesEnum.SOBRESALIENTE.getValorMin())
			   ||nota.equals(CalificacionesEnum.SOBRESALIENTE.getValorMax())){
				alumno.setCalificacion(CalificacionesEnum.SOBRESALIENTE);
			}else if(nota.equals(CalificacionesEnum.NOTABLE.getValorMin())
					   ||nota.equals(CalificacionesEnum.NOTABLE.getValorMax())){
						alumno.setCalificacion(CalificacionesEnum.NOTABLE);
			}else if(nota.equals(CalificacionesEnum.BIEN.getValorMin())
					   ||nota.equals(CalificacionesEnum.BIEN.getValorMax())){
						alumno.setCalificacion(CalificacionesEnum.BIEN);
			}else if(nota.equals(CalificacionesEnum.SUFICIENTE.getValorMin())
					   ||nota.equals(CalificacionesEnum.SUFICIENTE.getValorMax())){
						alumno.setCalificacion(CalificacionesEnum.SUFICIENTE);
			}else {
				alumno.setCalificacion(CalificacionesEnum.INSUFICIENTE);
			}
		}
		
		//Si orden
		System.out.println("SIN ORDEN");
		alumnos.stream().forEach(a->System.out.println(a.getNombre()+", calificacion: " + a.getCalificacion()));
	
		Collections.sort(alumnos, new Comparator<Alumno>() {

			@Override
			public int compare(Alumno o1, Alumno o2) {			
				return o1.getCalificacion().compareTo(o2.getCalificacion());
			}
		});
		
		System.out.println("INTENTO DE ORDENACION");
		alumnos.stream().forEach(a->System.out.println(a.getNombre()+", calificacion: " + a.getCalificacion()));
				
	}
	
}

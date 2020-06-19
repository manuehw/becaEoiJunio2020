package edu.es.eoi;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class Empresa {

	private String nombre;
	private int size = 0;
	private List<Empleado> empleados;
	private int contador;
	
	public Empresa(String nombre, int size) {		
		this.nombre = nombre;
		this.size = size;
		empleados= new ArrayList<Empleado>(size);
	}
	
	public void nuevoEmpleado(String nombre, double sueldo) {
		
		Empleado empleado= new Empleado(this, nombre, sueldo, contador);		
		this.empleados.add(empleado);
		contador++;		
	}
	
	public Empleado getEmpleado(int numeroEmpleado) {
		
		if (numeroEmpleado<empleados.size()) {
			return empleados.get(numeroEmpleado);
		}else {
			return null;
		}		
		
	}
	
	
	public static void main(String[] args) {
		
		Empresa empresa= new Empresa("ACME", 20);
		
		empresa.nuevoEmpleado("PEPE", 25000);
		empresa.nuevoEmpleado("MARIA", 25000);
		
		empresa.empleados.forEach(System.out::println);

		empresa.getEmpleado(0).ascender();
		
		empresa.empleados.forEach(System.out::println);
		
	}
}

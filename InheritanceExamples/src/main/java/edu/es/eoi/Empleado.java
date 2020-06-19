package edu.es.eoi;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString(exclude = "empresa")
public class Empleado {
	
	private Empresa empresa;
	private String nombre;
	private double sueldo;
	private int numEmpleado;
	
	public final void aumentarSueldo(double porcentaje) {
		this.sueldo=this.sueldo*porcentaje;
	}
	
	public void despedir() {
		this.empresa.getEmpleados().remove(this.numEmpleado);
		System.out.println("FIRED " + this.nombre);
	}
	
	public Empresa getEmpresa() {
		return empresa;
	}	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getSueldo() {
		return sueldo;
	}	
	public int getNumEmpleado() {
		return numEmpleado;
	}
	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}	
	
	
	
}

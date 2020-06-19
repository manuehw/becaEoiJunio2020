package edu.es.eoi;

import lombok.Getter;

@Getter
public class Ejecutivo extends Empleado {
	
	private double presupuesto;
	
	public Ejecutivo(Empresa empresa, String nombre, double sueldo, int numEmpleado) {
		super(empresa, nombre, sueldo, numEmpleado);		
	}

	public void asignarPresupuesto(double cantidad) {
		this.presupuesto=cantidad;
	}

	@Override
	public String toString() {
		return "Soy un ejecutivo";
	}
	
	
}

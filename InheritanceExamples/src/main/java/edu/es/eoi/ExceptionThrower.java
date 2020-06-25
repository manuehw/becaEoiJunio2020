package edu.es.eoi;

import java.util.Calendar;

public class ExceptionThrower {

	//clase que lanza excepciones de tipo EOIException
	
	public void doSomething() throws EOIException {
		
		throw new EOIException("He lanzado un error",Calendar.getInstance().getTime());
	}
	
}

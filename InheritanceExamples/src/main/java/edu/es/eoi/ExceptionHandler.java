package edu.es.eoi;

public class ExceptionHandler {
	
	//metodo que genere excepciones y las capturamos aqui
	
	void callDoSomething() {
		
		ExceptionThrower t= new ExceptionThrower();
		
		try {
			t.doSomething();
		} catch (EOIException e) {
			System.out.println(e);	
			e.printStackTrace();
		}
	}

}

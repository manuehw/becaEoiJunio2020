package edu.es.eoi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionExamples {

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.setName("JOSE");
		Person p2 = new Person();
		p2.setName("JOAQUIN");
		Person p3 = new Person();
		p3.setName("LUISA");
		Person p4 = new Person();
		p4.setName("PEDRO");
		Person p5 = new Person();
		p5.setName("MARIA");

		// Collections
		System.out.println("**********************");
		// SET y LIST

		Set<Person> set = new HashSet<Person>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		set.remove(p5);

		for (Person person : set) {
			System.out.println(person.getName());
		}

		Set<String> setStrings= new HashSet<String>();
		setStrings.add("A");
		setStrings.add("D");
		setStrings.add("H");
		setStrings.add("B");		
		
		System.out.println("**********************");

		List<Person> lista = new ArrayList<Person>();
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		lista.add(p5);

		lista.remove(p5);

		System.out.println(lista.get(lista.indexOf(p3)).getName());

//		for (Person person : lista) {
//			System.out.println(person.getName());
//		}
		
		//Ejercicio SET y LISTAS
		
		//Agenda telefonica (numeros tlf)
		//Contacto y Set<String> telefonos;
		
		//SET (HASHSET)
		//1 crear Contacto (nombre apellidos) y meterle 3 telefonos
		//2 localizar el tlf a llamar (llamar-> syso(he llamado al numero .....)
		//3 meter un nuevo telefono para el mismo contacto
		//4 Imprimir todos los telefonos de un contacto
		//***************FIN SET*************
		
		//LIST (ARRAYLIST)
		//1 crear Contacto (nombre apellidos) y meterle 3 telefonos
		//2 localizar el tlf a llamar (llamar-> syso(he llamado al numero .....)
		//3 meter un nuevo telefono para el mismo contacto
		//4 Imprimir todos los telefonos de un contacto
		//***************FIN LIST*************
		
		
		
		

	}

}

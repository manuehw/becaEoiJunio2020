package edu.es.eoi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
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
		
		//1
		Contact contact= new Contact();
		contact.setName("Jose");
		contact.setSurname("Jimenez");		
		
		Set<String> phonesSet= new HashSet<String>();
		phonesSet.add("612334567");
		phonesSet.add("666666666");
		phonesSet.add("777777777");
		
		contact.setTelephonesSet(phonesSet);
		//2
		String numero="666666666";
		
		for (String phoneNumber : contact.getTelephonesSet()) {
			if(phoneNumber.equals(numero)) {
				System.out.println("estoy llamando al " + phoneNumber);
			}
		}
		//3
		contact.getTelephonesSet().add("888888888");
		//4		
		for (String phone : phonesSet) {
			System.out.println("Tlf: "+phone);
		}		
		
		//LIST (ARRAYLIST)
		//1 crear Contacto (nombre apellidos) y meterle 3 telefonos
		//2 localizar el tlf a llamar (llamar-> syso(he llamado al numero .....)
		//3 meter un nuevo telefono para el mismo contacto
		//4 Imprimir todos los telefonos de un contacto
		//***************FIN LIST*************
		
		List<String> phonesList= new ArrayList<String>();
		phonesList.add("612334567");
		phonesList.add("666666666");
		phonesList.add("777777777");
		
		contact.setTelephonesList(phonesList);
		
		//2 llamar al numero 666666666
		
		String phoneNumber = contact.getTelephonesList().get(contact.getTelephonesList().indexOf("666666666"));
		
		System.out.println("estoy llamando al " + phoneNumber);
		
		//3 
		if(!contact.getTelephonesList().contains("88888888")) {
			contact.getTelephonesList().add("888888888");
		}
		
		//4		
		for (String phone : phonesList) {
			System.out.println(phone);
		}

		//Ejercicio Ordenacion
		
		Collections.sort(phonesList);
		
		//Forma 1 Complicada
		
		Contact c1= new Contact();
		c1.setName("Jose");
		c1.setYear(2000);
		Contact c2= new Contact();
		c2.setName("Maria");
		c2.setYear(1995);
		Contact c3= new Contact();
		c3.setName("Pedro");
		c3.setYear(1998);
		Contact c4= new Contact();
		c4.setName("Jose");
		c4.setYear(2005);
		
		List<Contact> contactos= new ArrayList<Contact>();
		contactos.add(c1);
		contactos.add(c2);
		contactos.add(c3);
		contactos.add(c4);
		
		Collections.sort(contactos);
		
		contactos.stream().forEach(c-> System.out.println(c.getName()+", year: "+ c.getYear() ));
		
	}

}

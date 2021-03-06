package edu.es.eoi;

import java.util.List;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contact {

	private String name;
	private String surname;
	private String nif;
	private Set<String> telephonesSet;
	private List<String> telephonesList;
	private Integer year;
	private Integer month;

}

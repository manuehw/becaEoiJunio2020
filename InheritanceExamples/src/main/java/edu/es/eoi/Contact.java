package edu.es.eoi;

import java.util.List;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contact implements Comparable<Contact>{

	private String name;
	private String surname;
	private Set<String> telephonesSet;
	private List<String> telephonesList;
	private Integer year;
	private Integer month;
	
	@Override
	public int compareTo(Contact o) {		
		return o.getYear().compareTo(this.year);
	}
}

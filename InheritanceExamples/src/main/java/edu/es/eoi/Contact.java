package edu.es.eoi;

import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contact {

	private String name;
	private String surname;
	private Set<String> telephones;
}

package edu.es.eoi.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Season {
	
	private String name;
	private String year;
	private Chapter[] chapters;

}

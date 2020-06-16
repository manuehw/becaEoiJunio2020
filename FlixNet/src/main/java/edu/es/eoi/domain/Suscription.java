package edu.es.eoi.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Suscription {
	
	private String suscriptionType;
	private double amount;
	private boolean autoRenewal;

}

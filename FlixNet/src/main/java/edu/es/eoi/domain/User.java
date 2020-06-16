package edu.es.eoi.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User extends Person {
	
	private String username;
	private String password;
	private String iban;
	private Suscription suscription;
	private Profile[] profiles;
	private Wishlist wishList;
	
	
	
	

}

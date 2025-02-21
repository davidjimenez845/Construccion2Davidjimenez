package app.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

public class Pets {
	private String petname;
	private long ownercedula;
	private int age;
	private long Id;
	private String species;
	private String race;
	private String characteristics; 
	private int weight;
	
	
	public Pets(String namepet, long cedulaowner, int age, long id, String species, String race, String characteristics,
			int weight) {
		super();
		this.petname = namepet;
		this.ownercedula = cedulaowner;
		this.age = age;
		Id = id;
		this.species = species;
		this.race = race;
		this.characteristics = characteristics;
		this.weight = weight;
	}
	
	
	
	

}

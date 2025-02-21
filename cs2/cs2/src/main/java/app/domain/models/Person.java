/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package app.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author USUARIO
 */
@Setter
@Getter
@NoArgsConstructor
public class Person {
	private long cedula;
	private String name;
	private int age;
	private String role;

	
	public Person(long cedula, String name, int age, String role, String user, String password) {
		super();
		this.cedula = cedula;
		this.name = name;
		this.age = age;
		this.role = role;
		
		
	
	} 
	
	
	}
	
	


}

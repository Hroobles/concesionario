package com.hernan.proyectoPrueba.Util;

import java.util.Date;

import com.hernan.proyectoPrueba.Coches.Coche;
import com.hernan.proyectoPrueba.Personas.Persona;

public class Start {

	public static void main(String[] args) {
		
		Persona persona = new Persona("Hernan", new Date(),"Mieres");
		
		Coche coche = new Coche(persona);
		coche.setConsumo(2.4f);
		coche.setPuertas(5);
		System.out.println(coche);
		
	}

}

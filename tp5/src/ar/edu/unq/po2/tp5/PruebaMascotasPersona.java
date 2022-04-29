package ar.edu.unq.po2.tp5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PruebaMascotasPersona {

	public static void main(String[] args) {
		Mascota mascota1 = new Mascota("pepe", "beagle");
		Mascota mascota2 = new Mascota("toby", "caniche");
		Persona persona1 = new Persona("carla", LocalDate.of(2001, 2, 22));
		Persona persona2 = new Persona("carlos", LocalDate.of(2005, 2, 24));

		System.out.println(
				"nombre mascota1: " + mascota1.getNombre() + ", " + 
				"raza mascota1: " + mascota1.getRaza());

		System.out.println(
				"nombre mascota2: " + mascota2.getNombre() + ", " + 
				"raza mascota2: " + mascota2.getRaza());

		System.out.println(
				"nombre persona1: " + persona1.getNombre() + ", " + 
				"edad persona1: " + persona1.getEdad());
		
		System.out.println(
				"nombre persona2: " + persona2.getNombre() + ", " + 
				"edad persona2: " + persona2.getEdad());
		
		System.out.println(persona1.menorQue(persona2));

		List<SerVivo> mascotas = new ArrayList<SerVivo>();
		mascotas.add(mascota1);
		mascotas.add(mascota2);

		List<SerVivo> personas = new ArrayList<SerVivo>();
		personas.add(persona1);
		personas.add(persona2);

		for (int i = 0; i < personas.size(); i++) {
			String nombre = personas.get(i).getNombre();
			System.out.println(nombre);
		}

		for (int i = 0; i < mascotas.size(); i++) {
			String nombre = mascotas.get(i).getNombre();
			System.out.println(nombre);
		}

	}

}

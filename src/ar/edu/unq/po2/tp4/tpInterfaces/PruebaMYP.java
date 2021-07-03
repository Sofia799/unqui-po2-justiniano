package ar.edu.unq.po2.tp4.tpInterfaces;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class PruebaMYP {

	public static void main(String[] args) throws ParseException {

		//ArrayList<SerVivo> personasYMascotas = new ArrayList<SerVivo>();
		ArrayList<ISerVivo> personasYMascotas = new ArrayList<ISerVivo>();

		Persona sofia = new Persona();
		sofia.setNombre("Sofia");
		sofia.setFechaDeNacimiento(crearFecha("22/02/2001"));
		sofia.setEdad(20);
		System.out.println(sofia.getFechaDeNacimiento());

		Persona pepe = new Persona();
		pepe.setNombre("Pepe");
		pepe.setFechaDeNacimiento(crearFecha("09/02/1991"));
		pepe.setEdad(30);

		System.out.println(sofia.esMenorQue(pepe));

		Mascota rocco = new Mascota();
		rocco.setNombre("Rocco");
		rocco.setRaza("Beagle");
		System.out.println(rocco.getNombre());
		System.out.println(rocco.getRaza());

		Mascota luna = new Mascota();
		luna.setNombre("Luna");
		luna.setRaza("Golden");
		System.out.println(luna.getNombre());
		System.out.println(luna.getRaza());

		personasYMascotas.add(pepe);
		personasYMascotas.add(luna);
		personasYMascotas.add(rocco);
		personasYMascotas.add(sofia);
		System.out.println(personasYMascotas);

		for (int i = 0; i < personasYMascotas.size(); i++) {
			String nombres = personasYMascotas.get(i).getNombre();
			System.out.println(nombres); 
		}

	}

	private static Date crearFecha(String fecha) throws ParseException {
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
		return date;
	}

}

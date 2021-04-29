package ar.edu.unq.po2.tp3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;


public class Prueba2 {

	public static void main(String[] args) throws ParseException {

		String a = new String("abc");
		String s = a;
		//String t;
		ArrayList<Persona> personas = new ArrayList<Persona>();
		

		Persona sofia = new Persona();
		sofia.setNombre("sofia");
		sofia.setApellido("justiniano");
		sofia.setEdad(20);

		Persona silvio = new Persona();
		silvio.setNombre("silvio");
		silvio.setApellido("justiniano");
		silvio.setEdad(50);
		silvio.setFechaDeNacimiento(crearFecha("22/02/2001"));

		System.out.println(sofia.menorQue(silvio));
		
		Persona unaPersona = new Persona("sofia", crearFecha("22/02/2001"));
		System.out.println(unaPersona);

		personas.add(sofia);
		personas.add(silvio);

		for (int i = 0; i < personas.size(); i++) {
			Persona persona = personas.get(i);
			System.out.println(persona.getNombre() + " " + persona.getApellido() + " " + persona.getFechaDeNacimiento());

		}

		// Ejercicio punto 2.
		System.out.println(a.length());
		/*
		 * System.out.println(t.length());
		 * 
		 * Da error porque t al no estar inicializada, su valor es null.
		 * 
		 */
		System.out.println(1 + a);
		System.out.println(a.toUpperCase());
		System.out.println("Libertad".indexOf("r"));
		System.out.println("Universidad".lastIndexOf('i'));
		System.out.println("Quilmes".substring(2, 4));
		System.out.println((a.length() + a).startsWith("a")); // Retorna False porque la cadena no empieza con "a"
		System.out.println(s == a);
		System.out.println(a.substring(1, 3).equals("bc")); // Retorna True porque a.substring(1,3) es igual a "bc"

		/*
		 * int numero; Integer numero2;
		 * 
		 * System.out.println(numero); System.out.println(numero2);
		 * 
		 */

	}

	private static Date crearFecha(String fecha) throws ParseException {
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
		return date;
	}

}

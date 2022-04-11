package ar.edu.unq.po2.tp3;

import java.time.LocalDate;

public class Prueba {

	public static void main(String[] args) {
		String a = "abc";
		String s = a;
		String t;

		System.out.println(s.length()); // retorna 3,el tamaño de la cadena
		// System.out.println(t.length()); da error al momento de compilar porque no
		// está inicializada la variable
		System.out.println(1 + a); // retorna "1abc"
		System.out.println(a.toUpperCase()); // retorna "ABC"
		System.out.println("Libertad".indexOf("r")); // retorna 4. La posicion en donde se encuentra la r
		System.out.println("Universidad".lastIndexOf('i')); // retorna 7. la posicion donde aparece la ultima vez la i
		System.out.println("Quilmes".substring(2, 4)); // retorna "il". Toma una parte del string para conformar un
														// substring desde la posicion 2 hasta la 4 sin incluir éste
														// último
		System.out.println((a.length() + a).startsWith("a"));// retorna false. Porque al hacer a.length() + a , esto
																// retorna "3abc", y si luego llamamos al metodo
																// .startsWith("a"), indica si la cadena resultante
																// empieza con 'a', lo cual es falso.
		System.out.println(s == a); // retorna true. ya que las 2 variables son iguales.
		System.out.println(a.substring(1, 3).equals("bc")); // retorna true. la subcadena que retorna a.substring(1,3)
															// es "bc"
		
		Integer nro = null;
		System.out.println(nro);
		
		Integer hoy = LocalDate.now().compareTo(LocalDate.of(2001, 2, 22));
		System.out.println(hoy);
	}
	
	public void metodoPrueba() {
		Integer nro = null;
		System.out.println("metodo prueba: " + nro);
		
	}

}

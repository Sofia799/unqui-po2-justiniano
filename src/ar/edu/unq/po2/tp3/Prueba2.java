package ar.edu.unq.po2.tp3;

public class Prueba2 {

	public static void main(String[] args) {
			
			String a = "abc";
			String s = a;
			String t;
			
			System.out.println(a.length());
			
			/* 
			System.out.println(t.length()); 
			
			//Da error porque t al no estar inicializada, su valor es null.
			 
			*/
			
			System.out.println(1 + a);
			
			System.out.println(a.toUpperCase());
			
			System.out.println("Libertad".indexOf("r"));
			
			System.out.println("Universidad".lastIndexOf('i'));
			
			System.out.println("Quilmes".substring(2,4));
			
			System.out.println((a.length() + a).startsWith("a")); // Retorna False porque la cadena no empieza con "a"
			
			System.out.println(s == a);
			
			System.out.println(a.substring(1,3).equals("bc")); // Retorna True porque a.substring(1,3) es igual a "bc"
	}

}

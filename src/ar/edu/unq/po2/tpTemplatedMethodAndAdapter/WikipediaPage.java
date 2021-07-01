package ar.edu.unq.po2.tpTemplatedMethodAndAdapter;

import java.util.List;
import java.util.Map;

public interface WikipediaPage {
	
	String getTittle(); // retorna el título de la página
	
	List<WikipediaPage> getLinks(); //retorna una lista de páginas de wikipedia con las que se conecta
	
	Map<String, WikipediaPage> getInfobox(); 
	/*
	Retorna un Map con un valor en texto y la página que describe ese valor que aparecen
	en los infobox de la pagina de wikipedia.
	*/

}

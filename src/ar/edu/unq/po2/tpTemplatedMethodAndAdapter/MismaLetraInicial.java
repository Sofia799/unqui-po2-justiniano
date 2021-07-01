package ar.edu.unq.po2.tpTemplatedMethodAndAdapter;

import java.util.List;
import java.util.stream.Collectors;

public class MismaLetraInicial extends FiltrosPage {

	public MismaLetraInicial(String tittle) {
		setTittle(tittle);
	}

	private void setTittle(String tittle) {
		this.tittle = tittle;

	}

	@Override
	protected List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
		List<WikipediaPage> listadoDeWikipedias = wikipedia.stream()
				.filter(w -> w.getTittle().charAt(0) == page.getTittle().charAt(0)).collect(Collectors.toList());
		
		return listadoDeWikipedias;
	}

}

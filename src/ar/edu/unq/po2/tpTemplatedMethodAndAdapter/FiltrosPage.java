package ar.edu.unq.po2.tpTemplatedMethodAndAdapter;

import java.util.List;

public abstract class FiltrosPage {
	
	String tittle;
	String link;

	public FiltrosPage() {
		// TODO Auto-generated constructor stub
	}

	protected abstract List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia);

	
}

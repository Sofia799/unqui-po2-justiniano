package ar.edu.unq.po2.tpTemplatedMethodAndAdapter;

import java.util.ArrayList;
import java.util.List;

public class PropiedadEnComun extends FiltrosPage {

	@Override
	protected List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
		List<WikipediaPage> listado = new ArrayList<WikipediaPage>();
		for(WikipediaPage wikiPage: wikipedia) {
			if (wikiPage.getInfobox().keySet().equals(page.getInfobox().keySet())) {
				listado.add(wikiPage);
			}
		}
		
		return listado;
	}

}

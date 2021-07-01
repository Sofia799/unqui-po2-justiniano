package ar.edu.unq.po2.tpTemplatedMethodAndAdapter;

import java.util.ArrayList;
import java.util.List;

public class LinkEnComun extends FiltrosPage {

	public LinkEnComun(String link) {
		setLink(link);
	}

	private void setLink(String link) {
		this.link = link;

	}

	@Override
	protected List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
		List<WikipediaPage> listado = new ArrayList<WikipediaPage>();

		for (WikipediaPage pageWiki : wikipedia) {
			if (pageWiki.getLinks().contains(page)) {
				listado.add(page);
			}

		}
		return listado;

	}

}

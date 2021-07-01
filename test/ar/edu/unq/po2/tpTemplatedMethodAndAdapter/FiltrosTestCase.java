package ar.edu.unq.po2.tpTemplatedMethodAndAdapter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FiltrosTestCase {
	FiltrosPage mismaLetraInicial;
	FiltrosPage linkEnComun;
	FiltrosPage propiedadEnComun;

	WikipediaPage page1;
	WikipediaPage page2;
	WikipediaPage page3;

	@BeforeEach
	void setUp() throws Exception {

		mismaLetraInicial = new MismaLetraInicial("La Plata");
		linkEnComun = new LinkEnComun("Buenos Aires");
		propiedadEnComun = new PropiedadEnComun();

		page1 = mock(WikipediaPage.class);
		page2 = mock(WikipediaPage.class);
		page3 = mock(WikipediaPage.class);

	}

	@Test
	void testFiltroMismaLetraInicialObtieneListadoDePagesCoincidentes() {
		List<WikipediaPage> pages = new ArrayList<WikipediaPage>();
		pages.add(page1);
		pages.add(page2);
		pages.add(page3);

		when(page1.getTittle()).thenReturn("La Plata");
		when(page2.getTittle()).thenReturn("Lobos");
		when(page3.getTittle()).thenReturn("Caballito");

		List<WikipediaPage> pagesCoincidentes = mismaLetraInicial.getSimilarPages(page1, pages);

		assertFalse(pagesCoincidentes.isEmpty());
		assertEquals(pagesCoincidentes.size(), 2);

	}

	@Test
	void testFiltroLinkEnComunObtieneListadoDePagesCoincidentes() {
		List<WikipediaPage> wikipediaPages = new ArrayList<WikipediaPage>();
		wikipediaPages.add(page1); // page Gimnasia
		wikipediaPages.add(page2); // page Buenos Aires
		wikipediaPages.add(page3); // page La Plata

		List<WikipediaPage> pagesLinksCompartidos = new ArrayList<WikipediaPage>();
		pagesLinksCompartidos.add(page3);

		when(page1.getLinks()).thenReturn(pagesLinksCompartidos);
		when(page2.getLinks()).thenReturn(pagesLinksCompartidos);

		List<WikipediaPage> pagesSimilares = linkEnComun.getSimilarPages(page3, wikipediaPages);

		assertFalse(pagesSimilares.isEmpty());
		assertTrue(pagesSimilares.contains(page3));
		assertEquals(pagesSimilares.size(), 2);

	}

	@Test
	void testFiltroPropiedadEnComunObtieneListadoDePagesCoincidentes() {
		List<WikipediaPage> wikipediaPages = new ArrayList<WikipediaPage>();
		wikipediaPages.add(page1); // page Gimnasia
		wikipediaPages.add(page2); // page Buenos Aires
		wikipediaPages.add(page3); // page La Plata

		Map<String, WikipediaPage> propiedadesPage1 = new HashMap<String, WikipediaPage>();
		propiedadesPage1.put("birth_place", page1);

		Map<String, WikipediaPage> propiedadesPage2 = new HashMap<String, WikipediaPage>();
		propiedadesPage2.put("birth_place", page2);

		Map<String, WikipediaPage> propiedadesPage3 = new HashMap<String, WikipediaPage>();
		propiedadesPage3.put("palace", page3);

		when(page1.getInfobox()).thenReturn(propiedadesPage1);
		when(page2.getInfobox()).thenReturn(propiedadesPage2);
		when(page3.getInfobox()).thenReturn(propiedadesPage3);

		List<WikipediaPage> propiedadesCompartidas = new ArrayList<WikipediaPage>();
		propiedadesCompartidas.add(page3);

		List<WikipediaPage> pagesCoincidentes = propiedadEnComun.getSimilarPages(page2, wikipediaPages);

		assertEquals(pagesCoincidentes.size(), 2);

	}

}

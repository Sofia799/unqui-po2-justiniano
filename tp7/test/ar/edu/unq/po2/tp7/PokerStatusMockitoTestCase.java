package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusMockitoTestCase {

	PokerStatus pokerStatus;
	Carta carta1;
	Carta carta2;
	Carta carta3;
	Carta carta4;
	Carta carta5;
	Jugada jugada1;

	@BeforeEach
	void setUp() throws Exception {
		pokerStatus = new PokerStatus(); // SUT
		carta1 = mock(Carta.class); // DOC
		carta2 = mock(Carta.class); // DOC
		carta3 = mock(Carta.class); // DOC
		carta4 = mock(Carta.class); // DOC
		carta5 = mock(Carta.class); // DOC
		jugada1 = mock(Jugada.class); // DOC
	}

	@Test
	void elMetodoVerificarIndicaPoquerSiLasCartasFormanUnJuegoDePoquer() {
		when(carta1.tieneMismoValor(carta2)).thenReturn(true);
		when(carta2.tieneMismoValor(carta3)).thenReturn(true);
		when(carta3.tieneMismoValor(carta4)).thenReturn(true);

		assertEquals(pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5), "Poquer");
	}

	@Test
	void elMetodoVerificarIndicaNadaSiLasCartasNoFormanUnJuego() {
		when(carta1.tieneMismoValor(carta2)).thenReturn(false);
		when(carta2.tieneMismoValor(carta3)).thenReturn(false);
		when(carta3.tieneMismoValor(carta4)).thenReturn(false);

		assertEquals(pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5), "Nada");
	}

	@Test
	void elMetodoVerificarIndicaColorSiLasCartasFormanUnJuegoDeColor() {
		when(carta1.tieneMismoPaloDe(carta2)).thenReturn(true);
		when(carta2.tieneMismoPaloDe(carta3)).thenReturn(true);
		when(carta3.tieneMismoPaloDe(carta4)).thenReturn(true);
		when(carta4.tieneMismoPaloDe(carta5)).thenReturn(true);

		assertEquals(pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5), "Color");
	}

	@Test
	void elMetodoVerificarIndicaColorSiLasCartasFormanUnJuegoDeTrio() {
		when(carta1.tieneMismoValor(carta2)).thenReturn(true);
		when(carta2.tieneMismoValor(carta3)).thenReturn(true);

		assertEquals(pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5), "Trio");
	}

	@Test
	void seConoceElEstadoDeUnaJugadaDeJugador() {
		when(carta1.tieneMismoValor(carta2)).thenReturn(true);
		when(carta2.tieneMismoValor(carta3)).thenReturn(true);

		when(jugada1.getCarta1()).thenReturn(carta1);
		when(jugada1.getCarta2()).thenReturn(carta2);
		when(jugada1.getCarta3()).thenReturn(carta3);
		when(jugada1.getCarta4()).thenReturn(carta4);
		when(jugada1.getCarta5()).thenReturn(carta5);

		assertEquals(pokerStatus.estadoManoDeJugador(jugada1), "Trio");

	}

}

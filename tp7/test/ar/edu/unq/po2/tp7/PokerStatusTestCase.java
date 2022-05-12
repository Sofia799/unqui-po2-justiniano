package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTestCase {

	PokerStatus pokerStatus;
	Carta carta1;
	Carta carta2;
	Carta carta3;
	Carta carta4;
	Carta carta5;

	@BeforeEach
	void setUp() throws Exception {
		pokerStatus = new PokerStatus();
	}

	@Test
	void elMetodoVerificarIndicaPoquerSiLasCartasFormanUnJuegoDePoquer() {
		// Un jugador obtiene póquer si de las cinco cartas recibidas, cuatro cartas
		// iguales en su valor

		carta1 = new Carta("Picas", "2");
		carta2 = new Carta("Corazones", "2");
		carta3 = new Carta("Diamantes", "2");
		carta4 = new Carta("Trebol", "2");
		carta5 = new Carta("Trebol", "4");

		assertEquals(pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5), "Poquer");

	}

	@Test
	void elMetodoVerificarIndicaNadaSiLasCartasNoFormanUnJuego() {
		// Setup
		carta1 = new Carta("Picas", "J");
		carta2 = new Carta("Corazones", "Q");
		carta3 = new Carta("Diamantes", "4");
		carta4 = new Carta("Trebol", "9");
		carta5 = new Carta("Picas", "3");

		assertEquals(pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5), "Nada");
	}

	@Test
	void elMetodoVerificarIndicaColorSiLasCartasFormanUnJuegoDeColor() {
		// el color se da cuando las cinco cartas son del mismo color y palo
		carta1 = new Carta("Picas", "2");
		carta2 = new Carta("Picas", "4");
		carta3 = new Carta("Picas", "9");
		carta4 = new Carta("Picas", "K");
		carta5 = new Carta("Picas", "3");

		assertEquals(pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5), "Color");

	}

	@Test
	void elMetodoVerificarIndicaColorSiLasCartasFormanUnJuegoDeTrio() {
		// Mientras que el trio se da cuando tres cartas poseen el mismo valor.
		carta1 = new Carta("Picas", "6");
		carta2 = new Carta("Corazones", "6");
		carta3 = new Carta("Diamantes", "6");
		carta4 = new Carta("Trebol", "5");
		carta5 = new Carta("Picas", "2");

		assertEquals(pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5), "Trio");

	}

	@Test
	void seConoceElEstadoDeUnaJugadaDeJugador() {

		carta1 = new Carta("Picas", "6");
		carta2 = new Carta("Corazones", "6");
		carta3 = new Carta("Diamantes", "6");
		carta4 = new Carta("Trebol", "5");
		carta5 = new Carta("Picas", "2");

		Jugada jugador1 = new Jugada(carta1, carta2, carta3, carta4, carta5);

		String estadoDeJugadaJugador = pokerStatus.estadoManoDeJugador(jugador1);

		assertEquals(estadoDeJugadaJugador, "Trio");

	}

}

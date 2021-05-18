package ar.edu.unq.po2.tpTestUnidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testDadas5Cartas_SeVerificaQueElJugadorObtuvoPoquer() {
		PokerStatus pokerStatus = new PokerStatus();
		Boolean jugadorObtuvoPoquer = pokerStatus.verificar("2P","10P","10T","10C","10D");
		
		assertTrue(jugadorObtuvoPoquer);
	}

}

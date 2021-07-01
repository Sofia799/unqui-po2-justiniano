package ar.edu.unq.po2.tpTestUnidad;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest {
	
	PokerStatus pokerStatus;
	
	@BeforeEach
	void setUp() throws Exception {
		pokerStatus = new PokerStatus();
		
	}
	
	@Test
	void testDadas5Cartas_SeVerificaQueElJugadorObtuvoPoquer() {
		Boolean jugadorObtuvoPoquer = pokerStatus.verificar("QP","KP","QT","QC","QD");
		
		assertTrue(jugadorObtuvoPoquer);
		
	}
	
	@Test
	void testDadas5Cartas_SeVerificaQueElJugadorNoObtuvoPoquer() {
		Boolean jugadorObtuvoPoker = pokerStatus.verificar("3P", "6T", "QT", "2P", "QD");
		
		assertFalse(jugadorObtuvoPoker);
	}

}

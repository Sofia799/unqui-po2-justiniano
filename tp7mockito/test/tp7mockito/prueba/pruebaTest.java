package tp7mockito.prueba;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito.*;


class pruebaTest {
	PokerStatus pokerStatus;
	Carta carta1;

	@BeforeEach
	void setUp() throws Exception {
		pokerStatus = new PokerStatus(); // SUT
		carta1 = mock(Carta.class);
	
	}
	
	@Test
	void elMetodoVerificarIndicaPoquerSiLasCartasFormanUnJuegoDePoquer() {
		when(carta1.tieneMismoValor(carta1)).thenReturn(true);

		assertEquals(pokerStatus.verificar(carta1, carta1, carta1, carta1, carta1), "Poquer");
	}

}

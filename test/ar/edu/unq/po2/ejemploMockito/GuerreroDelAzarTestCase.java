package ar.edu.unq.po2.ejemploMockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GuerreroDelAzarTestCase {
	private GuerreroDelAzar guerreroAzar; //SUT
	private IGuerrero otroGuerrero;   	//DOC
	private IMoneda unaMoneda;			//DOC+
	Integer puntosDeVida;
	Integer puntosDeAtaque;

	@BeforeEach
	void setUp() throws Exception {
		
		puntosDeVida = 9000;
		puntosDeAtaque = 1000;
		unaMoneda = mock(IMoneda.class);
		otroGuerrero = mock(IGuerrero.class);
		
		guerreroAzar = new GuerreroDelAzar(puntosDeVida, puntosDeAtaque, unaMoneda);
	}

	@Test
	public void testUnGuerreroDelAzarAtacaAOtroGuerreroYLaMonedaSaleCaraDescuentanPuntosDeVidaDelAdversario() {
		
		when(unaMoneda.esCara()).thenReturn(true);
		
		guerreroAzar.atacar(otroGuerrero);
		
		verify(otroGuerrero).descontarVida(puntosDeAtaque);
		verify(otroGuerrero, times(1)).descontarVida(puntosDeAtaque); 
	}

	@Test
	public void testUnGuerreroDelAzarAtacaAOtroGuerreroYLaMonedaSaleCruzDescuentanPuntosDeVidaDeSiMismo() {
		
		when(unaMoneda.esCara()).thenReturn(false);
		when(unaMoneda.esCruz()).thenReturn(true);
		
		guerreroAzar.atacar(otroGuerrero);
		
		verify(otroGuerrero, never()).descontarVida(puntosDeAtaque); 
		/* Verifica que nunca se le envia el mensaje a otroGuerrero el descontarVida() */
		verify(otroGuerrero, times(0)).descontarVida(puntosDeAtaque); 
		/* cuántas veces quiero verificar que le hayan enviado el mensaje. En este caso 0,
		 	ya que nunca se le manda el mensaje descontarVida() a otroGuerrero*/
	}

}

package ar.edu.unq.po2.tp7;

public class PokerStatus {

	private Jugada jugadaGanadora;

	public String verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {

		String resultado;
		if (esPoquer(carta1, carta2, carta3, carta4, carta5)) {
			resultado = "Poquer";
		} else {
			if (esColor(carta1, carta2, carta3, carta4, carta5)) {
				resultado = "Color";
			} else {
				if (esTrio(carta1, carta2, carta3, carta4, carta5)) {
					resultado = "Trio";
				} else {
					resultado = "Nada";
				}
			}
		}
		return (resultado);
	}

	private Boolean esTrio(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		// Mientras que el trio se da cuando tres cartas poseen el mismo valor.
		return (tresDelMismoValor(carta1, carta2, carta3));
	}

	private Boolean tresDelMismoValor(Carta carta1, Carta carta2, Carta carta3) {
		return (carta1.tieneMismoValor(carta2) && carta2.tieneMismoValor(carta3));
	}

	private Boolean esColor(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		// el color se da cuando las cinco cartas son del mismo color y palo
		return (carta1.tieneMismoPaloDe(carta2) && carta2.tieneMismoPaloDe(carta3) && carta3.tieneMismoPaloDe(carta4)
				&& carta4.tieneMismoPaloDe(carta5));
	}

	private Boolean esPoquer(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		return (primerasCuatroDelMismoValor(carta1, carta2, carta3, carta4));
	}

	public Boolean primerasCuatroDelMismoValor(Carta carta1, Carta carta2, Carta carta3, Carta carta4) {
		return (carta1.tieneMismoValor(carta2) && carta2.tieneMismoValor(carta3) 
				&& carta3.tieneMismoValor(carta4));
	}

	public Jugada verificadorDeJugadas(Jugada jugadaJugador1, Jugada jugadaJugador2) {
		String estadoJugada1 = this.estadoManoDeJugador(jugadaJugador1);
		String estadoJugada2 = this.estadoManoDeJugador(jugadaJugador2);

		// Póquer le gana a Color y Color le gana a Trio.

		if (esEmpate(estadoJugada1, estadoJugada2)) {
			jugadaGanadora = desempate(jugadaJugador1, jugadaJugador2);
		} else {
			if (leGanaA(estadoJugada1, estadoJugada2)) {
				jugadaGanadora = jugadaJugador1;
			} else {
				if (leGanaA(estadoJugada2, estadoJugada1)) {
					jugadaGanadora = jugadaJugador2;
				}
			}
		}
		return (jugadaGanadora);
	}

	private Jugada desempate(Jugada jugadaJugador1, Jugada jugadaJugador2) {
		// Es decir, un trio con tres ases le gana a un trio con tres K
		return (jugadaGanadoraPorCartas(jugadaJugador1, jugadaJugador2));
	}

	private Jugada jugadaGanadoraPorCartas(Jugada jugadaJugador1, Jugada jugadaJugador2) {
		return (jugadaJugador1.jugadaGanadoraPorCartas(jugadaJugador2));
	}

	private Boolean leGanaA(String estadoJugada1, String estadoJugada2) {
		return (estadoJugada1 == "Poquer" && 
				(estadoJugada2 == "Color" || estadoJugada2 == "Trio"));
	}

	private Boolean esEmpate(String estadoJugada1, String estadoJugada2) {
		return (estadoJugada1 == estadoJugada2);
	}

	public String estadoManoDeJugador(Jugada jugadaJugador) {
		return (this.verificar(jugadaJugador.getCarta1(), 
				               jugadaJugador.getCarta2(),
				               jugadaJugador.getCarta3(), 
				               jugadaJugador.getCarta4(), 
				               jugadaJugador.getCarta5()));
	}

}

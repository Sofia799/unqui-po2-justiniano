package ar.edu.unq.po2.tp7;

public class Jugada {

	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;

	public Jugada(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		this.setCarta1(carta1);
		this.setCarta2(carta2);
		this.setCarta3(carta3);
		this.setCarta4(carta4);
		this.setCarta5(carta5);
	}

	public Carta getCarta1() {
		return carta1;
	}

	public void setCarta1(Carta carta1) {
		this.carta1 = carta1;
	}

	public Carta getCarta2() {
		return carta2;
	}

	public void setCarta2(Carta carta2) {
		this.carta2 = carta2;
	}

	public Carta getCarta3() {
		return carta3;
	}

	public void setCarta3(Carta carta3) {
		this.carta3 = carta3;
	}

	public Carta getCarta4() {
		return carta4;
	}

	public void setCarta4(Carta carta4) {
		this.carta4 = carta4;
	}

	public Carta getCarta5() {
		return carta5;
	}

	public void setCarta5(Carta carta5) {
		this.carta5 = carta5;
	}

	public Jugada jugadaGanadoraPorCartas(Jugada jugadaJugador2) {
		Jugada ganador;
		if (lasCartasLeGananA(jugadaJugador2)) {
			ganador = this;
		} else {
			ganador = (jugadaJugador2);
		}

		return (ganador);
	}

	private boolean lasCartasLeGananA(Jugada jugadaJugador2) {
		
		return (getCarta1().tieneValorSuperiorA(jugadaJugador2.getCarta1())
				&& getCarta2().tieneValorSuperiorA(jugadaJugador2.getCarta2())
				&& getCarta3().tieneValorSuperiorA(jugadaJugador2.getCarta3())
				&& getCarta4().tieneValorSuperiorA(jugadaJugador2.getCarta4())
				&& getCarta5().tieneValorSuperiorA(jugadaJugador2.getCarta5()));
	}

}

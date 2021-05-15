package ar.edu.unq.po2.ejemploMockito;

public class GuerreroDelAzar implements IGuerrero {

	private Integer puntosDeVida;
	private Integer puntosDeAtaque;
	private IMoneda miMoneda;

	public GuerreroDelAzar(Integer unosPuntosDeVida, Integer unosPuntosDeAtaque, IMoneda unaMoneda) {
		puntosDeVida = unosPuntosDeVida;
		puntosDeAtaque = unosPuntosDeAtaque;
		miMoneda = unaMoneda;
	}

	@Override
	public void atacar(IGuerrero unGuerrero) {
		if (miMoneda.esCara()) {
			unGuerrero.descontarVida(puntosDeAtaque);
		}
		if (miMoneda.esCruz()) {
			this.descontarVida(this.puntosDeAtaque);
		}

	}

	@Override
	public void descontarVida(Integer unosPuntosDeAtaque) {
		puntosDeVida = -unosPuntosDeAtaque;
	}

}

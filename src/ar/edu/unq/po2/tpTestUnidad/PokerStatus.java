package ar.edu.unq.po2.tpTestUnidad;

import java.util.ArrayList;

public class PokerStatus {

	ArrayList<String> listaCartas1 = new ArrayList<String>();
	ArrayList<String> listaCartas2 = new ArrayList<String>();

	public PokerStatus() {

	}

	public Boolean verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {

		ArrayList<String> cartas = new ArrayList<String>();
		cartas.add(carta1);
		cartas.add(carta2);
		cartas.add(carta3);
		cartas.add(carta4);
		cartas.add(carta5);

		listaCartas1.add(evaluarCarta(carta1));
		for (int i = 1; i < cartas.size(); i++) {
			String cartaEvaluada = evaluarCarta(cartas.get(i));
			if (listaCartas1.contains(cartaEvaluada)) {
				listaCartas1.add(cartaEvaluada);
			} else {
				if (listaCartas2.contains(cartaEvaluada) || listaCartas2.size() == 0) {
					listaCartas2.add(cartaEvaluada);
				}
			}

		}

		return isPoker();
	}

	private Boolean isPoker() {

		return listaCartas1.size() == 4 || listaCartas2.size() == 4;
	}

	private String evaluarCarta(String carta) {
		String cartaResultado = carta.replaceAll("\\D+", "");
		if (!cartaResultado.isEmpty()) {
			return cartaResultado;
		} else {
			return Character.toString(carta.charAt(0));
		}

	}

}

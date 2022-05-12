package ar.edu.unq.po2.tp7;

public class Carta {

	private String paloCarta;
	private Integer valorCarta;

	public Carta(String paloCarta, String valorCarta) {
		this.paloCarta = paloCarta;
		this.valorCarta = this.establecerValorDeCarta(valorCarta);

	}

	public Integer establecerValorDeCarta(String valorCarta) {
		int valorADefinir = 0;
		if (esNumerico(valorCarta)) {
			char charValorDeCarta = valorCarta.charAt(0);
			valorADefinir = Character.getNumericValue(charValorDeCarta);
		}
		if (valorCarta == "A") {
			valorADefinir = 1;
		} else {
			if (valorCarta == "J") {
				valorADefinir = 10;
			} else {
				if (valorCarta == "Q") {
					valorADefinir = 11;
				} else {
					if (valorCarta == "K") {
						valorADefinir = 12;
					}
				}
			}
		}

		return (valorADefinir);
	}
	
	private boolean esNumerico(String valorCarta) {
		
		return (valorCarta.contains("2")||
			    valorCarta.contains("3")||
			    valorCarta.contains("4")||
			    valorCarta.contains("5")||
			    valorCarta.contains("6")||
			    valorCarta.contains("7")||
			    valorCarta.contains("8")||
			    valorCarta.contains("9") ); 
	}

	public String getPalo() {
		return (this.paloCarta);
	}

	public int getValor() {
		return (this.valorCarta);
	}

	public boolean tieneValorSuperiorA(Carta carta2) {
			return ( this.getValor() > carta2.getValor() );
	}

	public boolean tieneMismoPaloDe(Carta carta2) {
		return ( this.getPalo() == carta2.getPalo() );
	}

	public boolean tieneMismoValor(Carta segundaCarta) {
		return (getValor() == segundaCarta.getValor());
	}


}

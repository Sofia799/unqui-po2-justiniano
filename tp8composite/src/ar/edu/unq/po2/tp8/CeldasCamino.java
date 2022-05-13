package ar.edu.unq.po2.tp8;

public class CeldasCamino {
	
	private Boolean hayLaja;
	
	public CeldasCamino(Boolean condicion) {
		this.setHayLaja(condicion);
	}
	
	public void setHayLaja(Boolean hayLaja) {
		this.hayLaja = hayLaja;
	}

	public Boolean hayLaja() {
		return hayLaja;
	}

}

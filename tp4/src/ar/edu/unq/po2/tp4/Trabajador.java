package ar.edu.unq.po2.tp4;

import java.util.List;

public class Trabajador {
	private List<IngresoPercibido> ingresos;

	public Trabajador(List<IngresoPercibido> ingresos) {
		setIngresos(ingresos);
	}

	public List<IngresoPercibido> getIngresos() {
		return ingresos;
	}

	public void setIngresos(List<IngresoPercibido> ingresos) {
		this.ingresos = ingresos;
	}

	public Double getTotalPercibido() {
		Double monto = 0.0;
		for (int i = 0; i < getIngresos().size(); i++) {
			monto = monto + getIngresos().get(i).getMontoPercibido();
		}
		return monto;
	}

	public Double getMontoImponible() {
		Double monto = 0.0;
		for (int i = 0; i < getIngresos().size(); i++) {
			monto = monto + getIngresos().get(i).montoImponible();
		}
		return monto;
	}

	public Double getImpuestoAPagar() {
		return (getMontoImponible() * 2) / 100;
	}

}

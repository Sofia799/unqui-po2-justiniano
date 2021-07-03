package ar.edu.unq.po2.tpSOLID;

public class Inmobiliaria {
	private float valorFiscal;
	private String descripcion;
	private String direccion;

	public Inmobiliaria(float valorFiscal) {
		this.setValorFiscal(valorFiscal);
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getValorFiscal() {
		return valorFiscal;
	}

	public void setValorFiscal(float valorFiscal) {
		this.valorFiscal = valorFiscal;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}

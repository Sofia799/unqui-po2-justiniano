package ar.edu.unq.po2.tp6;

import java.util.ArrayList;

public class Banco {

	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<ISolicitud> solicitudes = new ArrayList<ISolicitud>();

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public ArrayList<ISolicitud> getSolicitudes() {
		return solicitudes;
	}

	public void setSolicitudes(ArrayList<ISolicitud> solicitudes) {
		this.solicitudes = solicitudes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public void bancoConClientesRegistrados() {
		Cliente cliente1 = new Cliente("Juan", "Martin Fierro 1300", 28, 30.000f, 360.000f);
		Cliente cliente2 = new Cliente("Marta", "Las Flores 30", 25, 40.000f, 480.000f);
		agregarCliente(cliente1);
		agregarCliente(cliente2);
	}

	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}

	public void recibirSolicitudDeCliente(Cliente cliente) {
		ISolicitud solicitudCliente = cliente.getSolicitud();
		solicitudes.add(solicitudCliente);
	}

	public float calcularCreditoDeSolicitudDe(Cliente cliente) {
		float montoCredito = cliente.getSueldoNetoMensual();
		for (int i = 0; i < solicitudes.size(); i++) {
			if (solicitudes.get(i).equals(cliente.getSolicitud())) {
				montoCredito = montoCredito / calcularCredito(solicitudes.get(i));
			}
		}
		return montoCredito;
	}

	private float calcularCredito(ISolicitud solicitudCredito) {
		float credito = solicitudCredito.getMonto() * solicitudCredito.getCuotas();
		return credito;
	}

}

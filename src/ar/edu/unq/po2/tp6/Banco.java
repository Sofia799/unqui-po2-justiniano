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
	

	public ISolicitud procesarSolicitudDeCliente(Cliente cliente) {
		ISolicitud solicitud = null;
		for (int i = 0; i < solicitudes.size(); i++) {
			if (solicitudes.get(i).getNombreCliente().equals(cliente.getNombre())) {
				solicitud = solicitudes.get(i);
			}
		}
		return solicitud;
	}

	public Boolean validarOtorgamientoDeCreditoPersonalACliente(Cliente cliente) {
		float sueldoAnual = cliente.getSueldoNetoAnual();
		float sueldoMensual = cliente.getSueldoNetoMensual();
		float setentaPorcientoSueldoMensual = (sueldoMensual * 70) / 100;
		float montoDeCuota = cliente.getSolicitud().getMonto() / cliente.getSolicitud().getCuotas();
		
		return (sueldoAnual > 15.000f) && (montoDeCuota < setentaPorcientoSueldoMensual);
	}

	public Boolean validarOtorgamientoDeCreditoHipotecarioACliente(Cliente cliente) {
		float sueldoMensual = cliente.getSueldoNetoMensual();
		float cincuentaPorcientoSueldoMensual = (sueldoMensual * 50) / 100;
		float montoDeCuota = cliente.getSolicitud().getMonto() / cliente.getSolicitud().getCuotas();
		//float setentaPorcientoValorFiscal = cliente.getSolicitud();
		
		return (montoDeCuota < cincuentaPorcientoSueldoMensual) && (cliente.getEdad() < 65);
	}
	
	

}

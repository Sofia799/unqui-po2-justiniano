package ar.edu.unq.po2.tp6;

import java.util.List;

public class Banco {

	List<Cliente> clientes;
	List<SolicitudCredito> solicitudes;

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void addCliente(Cliente cliente) {
		getClientes().add(cliente);
	}
	
	public void addSolicitud(SolicitudCredito solicitud) {
		solicitudes.add(solicitud);
	}
	
	public void otorgarCredito(SolicitudCredito solicitud) {
		addSolicitud(solicitud);
		evaluarSolicitud(solicitud);
		
	}

	private void evaluarSolicitud(SolicitudCredito solicitud) {
		if (solicitud.esAceptable()) {
			solicitud.getCliente().recibirCredito(solicitud.getMonto());
		}
		
	}

}

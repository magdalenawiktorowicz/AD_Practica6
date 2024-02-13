package es.studium.springboot;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Viaje {
	@Value("Excursión a Málaga")
	private String nombre;
	@Value("Sevilla")
	private String origen;
	@Value("Málaga")
	private String destino;
	@Autowired
	private Tren trenAsignado;
	@Autowired
	private Set<Pasajero> pasajeros;
	
	public Viaje() {
		this.nombre = "";
		this.origen = "";
		this.destino = "";
		this.trenAsignado = new Tren();
		this.pasajeros = new HashSet<Pasajero>();
	}

	public Viaje(String nombre, String origen, String destino, Tren trenAsignado, Set<Pasajero> pasajeros) {
		this.nombre = nombre;
		this.origen = origen;
		this.destino = destino;
		this.trenAsignado = trenAsignado;
		this.pasajeros = pasajeros;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Tren getTrenAsignado() {
		return trenAsignado;
	}

	public void setTrenAsignado(Tren trenAsignado) {
		this.trenAsignado = trenAsignado;
	}

	public Set<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(Set<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}

	@Override
	public String toString() {
		return "Viaje [nombre=" + nombre + ", origen=" + origen + ", destino=" + destino + ", trenAsignado="
				+ trenAsignado + ", pasajeros=" + pasajeros + "]";
	}
}

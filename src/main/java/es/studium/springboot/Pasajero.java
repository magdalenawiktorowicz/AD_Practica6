package es.studium.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pasajero {
	@Value("Carmen")
	private String nombre;
	@Value("37")
	private String asientoPasajero;
	
	public Pasajero() {
		nombre = "";
		asientoPasajero = "";
	}

	public Pasajero(String nombre, String asientoPasajero) {
		this.nombre = nombre;
		this.asientoPasajero = asientoPasajero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAsientoPasajero() {
		return asientoPasajero;
	}

	public void setAsientoPasajero(String asientoPasajero) {
		this.asientoPasajero = asientoPasajero;
	}

	@Override
	public String toString() {
		return "Pasajero [nombre=" + nombre + ", asientoPasajero=" + asientoPasajero + "]";
	}
}

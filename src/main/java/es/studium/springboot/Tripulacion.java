package es.studium.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Tripulacion {
	@Value("Javier")
	private String nombre;
	@Value("conductor")
	private String cargo;
	
	public Tripulacion() {
		nombre = "";
		cargo = "";
	}

	public Tripulacion(String nombre, String cargo) {
		this.nombre = nombre;
		this.cargo = cargo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Tripulacion [nombre=" + nombre + ", cargo=" + cargo + "]";
	}
}

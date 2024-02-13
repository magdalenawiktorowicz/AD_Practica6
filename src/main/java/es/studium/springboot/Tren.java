package es.studium.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Tren {
	@Value("Talgo 747")
	private String modelo;
	@Value("120")
	private int numeroAsientosTren;
	@Autowired
	private List<Tripulacion> tripulacionAsignada;
	
	public Tren() {
		modelo = "";
		numeroAsientosTren = 0;
		tripulacionAsignada = new ArrayList<Tripulacion>();
	}

	public Tren(String model, int numeroAsientosTren, List<Tripulacion> tripulacionAsignada) {
		this.modelo = model;
		this.numeroAsientosTren = numeroAsientosTren;
		this.tripulacionAsignada = tripulacionAsignada;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumeroAsientosTren() {
		return numeroAsientosTren;
	}

	public void setNumeroAsientosTren(int numeroAsientosTren) {
		this.numeroAsientosTren = numeroAsientosTren;
	}

	public List<Tripulacion> getTripulacionAsignada() {
		return tripulacionAsignada;
	}

	public void setTripulacionAsignada(List<Tripulacion> tripulacionAsignada) {
		this.tripulacionAsignada = tripulacionAsignada;
	}

	@Override
	public String toString() {
		return "Tren [modelo=" + modelo + ", numeroAsientosTren=" + numeroAsientosTren + ", tripulacionAsignada="
				+ tripulacionAsignada + "]";
	}
}

package es.upm.dit.isst.conc.model;


import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Ocio implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String nReserva; 
	private String dni;
	private String actividad;
	private String fecha;
	private String precio;
	private String addComents;
	private String status;
	private String estado;
	
	//
	public String getnReserva() {
		return nReserva;
	}
	public void setnReserva(String nReserva) {
		this.nReserva = nReserva;
	}
	//
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	//
	public String getActividad() {
		return actividad;
	}
	public void setActividad(String actividad) {
		this.actividad = actividad;
	}
	//
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	//
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	//
	public String getAddComents() {
		return addComents;
	}
	public void setAddComents(String addComents) {
		this.addComents = addComents;
	}
	//
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	//
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nReserva == null) ? 0 : nReserva.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ocio other = (Ocio) obj;
		if (nReserva == null) {
			if (other.nReserva != null)
				return false;
		} else if (!nReserva.equals(other.nReserva))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Ocio [nReserva=" + nReserva + ", dni=" + dni + ", actividad=" + actividad + ", fecha=" + fecha
				+ ", precio=" + precio + ", addComents=" + addComents + "]";
	}
	
	
	
	

}
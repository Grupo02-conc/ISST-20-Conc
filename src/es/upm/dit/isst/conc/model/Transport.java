package es.upm.dit.isst.conc.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Transport implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	@Id
	private String nReserva;
	private String dni;
	private String type;
	private String date;
	private String destination;
	private String addComments;
	private String status;
	private String estado;
	
		
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getnReserva() {
		return nReserva;
	}
	
	public String getDNI() {
		return dni;
	}
	
	public String getType() {
		return type;
	}
	public String getDate() {
		return date;
	}
	public String getDestination() {
		return destination;
	}

	public String getAddComments() {
		return addComments;
	}
	
	public String getStatus() {
		return status;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setnReserva(String nReserva) {
		this.nReserva = nReserva;
	}
	public void setDNI(String dni) {
		this.dni = dni;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public void setAddComments(String addComments) {
		this.addComments = addComments;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setEstado(String estado) {
		this.estado = estado;
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
		Transport other = (Transport) obj;
		if (nReserva == null) {
			if (other.nReserva != null)
				return false;
		} else if (!nReserva.equals(other.nReserva))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Transport [dni=" + dni + ", type=" + type + ", date=" + date + "]";
	}

}

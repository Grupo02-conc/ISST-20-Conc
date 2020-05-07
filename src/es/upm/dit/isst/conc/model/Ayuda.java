package es.upm.dit.isst.conc.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ayuda implements Serializable {
	
	public Ayuda() {
		super();
		// TODO Auto-generated constructor stub
	}
	private static final long serialVersionUID = 1L;
	
	@Id
	private String descripcion;
	private String estado;
	private String dni;
	private String nAyuda;
	private int status;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getDescripcion() {
		return descripcion;
	}
	public String getEstado() {
		return estado;
	}
	public String getDni() {
		return dni;
	}
	public int getStatus() {
		return status;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Ayuda [descripcion=" + descripcion + ", estado=" + estado + ", dni=" + dni + ", nAyuda=" + nAyuda
				+ ", status=" + status + "]";
	}
	public String getnAyuda() {
		return nAyuda;
	}
	public void setnAyuda(String nAyuda) {
		this.nAyuda = nAyuda;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((nAyuda == null) ? 0 : nAyuda.hashCode());
		result = prime * result + status;
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
		Ayuda other = (Ayuda) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (nAyuda == null) {
			if (other.nAyuda != null)
				return false;
		} else if (!nAyuda.equals(other.nAyuda))
			return false;
		if (status != other.status)
			return false;
		return true;
	}
	

	


	

	

	
}
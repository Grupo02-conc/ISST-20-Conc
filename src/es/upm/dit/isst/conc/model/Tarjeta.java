package es.upm.dit.isst.conc.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tarjeta implements Serializable {
	
	public Tarjeta() {
		super();
		// TODO Auto-generated constructor stub
	}
	private static final long serialVersionUID = 1L;
	
	@Id
	private String numero;
	private String caducidad;
	private String codigo;
	private String dni;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getNumero() {
		return numero;
	}
	public String getCaducidad() {
		return caducidad;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public void setCaducidad(String caducidad) {
		this.caducidad = caducidad;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((caducidad == null) ? 0 : caducidad.hashCode());
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
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
		Tarjeta other = (Tarjeta) obj;
		if (caducidad == null) {
			if (other.caducidad != null)
				return false;
		} else if (!caducidad.equals(other.caducidad))
			return false;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Tarjeta [numero=" + numero + ", caducidad=" + caducidad + ", codigo=" + codigo + ", dni=" + dni + "]";
	}
	
	

	


	

	

	
}
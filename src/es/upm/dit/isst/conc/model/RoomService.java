package es.upm.dit.isst.conc.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class RoomService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	@Id
	private String nReserva;
	private String forClient;
	private String forRoom;
	private String type;
	private String description;
	private String date;
	private String addComents;
	private String status;
	private String estado;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getnReserva() {
		return nReserva;
	}
	public String getForClient() {
		return forClient;
	}
	public String getForRoom() {
		return forRoom;
	}
	public String getType() {
		return type;
	}
	public String getDescription() {
		return description;
	}
	public String getDate() {
		return date;
	}
	public String getAddComents() {
		return addComents;
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
	public void setForClient(String forClient) {
		this.forClient = forClient;
	}
	public void setForRoom(String forRoom) {
		this.forRoom = forRoom;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setAddComents(String addComents) {
		this.addComents = addComents;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
	
	
	
	
}
	
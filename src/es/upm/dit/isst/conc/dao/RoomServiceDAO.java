package es.upm.dit.isst.conc.dao;

import java.util.Collection;

import es.upm.dit.isst.conc.model.RoomService;

public interface RoomServiceDAO {
	
		public void create(RoomService roomService);
		public RoomService read(String nReserva);
		public void update(RoomService roomService);
		public void delete(RoomService roomService);
		public Collection<RoomService> readAll();
		


}

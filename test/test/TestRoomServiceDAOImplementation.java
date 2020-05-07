package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.upm.dit.isst.conc.dao.RoomServiceDAO;
import es.upm.dit.isst.conc.dao.RoomServiceDAOImplementation;
import es.upm.dit.isst.conc.model.RoomService;

class TestRoomServiceDAOImplementation {

	

	@Test
	void testCreate() {
		RoomServiceDAO roomservicedao = RoomServiceDAOImplementation.getInstance();
		RoomService roomservice = new RoomService();
		roomservice.setnReserva("1");
		roomservice.setAddComents("Que sea de bellota");
		roomservice.setDate("Para manana");
		roomservice.setDescription("lo quiero ya");
		roomservice.setEstado("Finalizado");
		roomservice.setForClient("056985");
		roomservice.setForRoom("502");
		roomservice.setStatus("4");
		roomservice.setType("Compra de jamon");
		roomservicedao.create(roomservice);
		assertEquals(roomservice.getnReserva(),"1");
		assertEquals(roomservice.getAddComents(),"Que sea de bellota");
		assertEquals(roomservice.getDate(),"Para manana");
		assertEquals(roomservice.getDescription(),"lo quiero ya");
		assertEquals(roomservice.getEstado(),"Finalizado");
		assertEquals(roomservice.getForClient(),"056985");
		assertEquals(roomservice.getForRoom(),"502");
		assertEquals(roomservice.getStatus(),"4");
		assertEquals(roomservice.getType(),"Compra de jamon");
		roomservicedao.delete(roomservice);
	}

	@Test
	void testRead() {
		RoomServiceDAO roomservicedao = RoomServiceDAOImplementation.getInstance();
		RoomService roomservice = new RoomService();
		roomservice.setnReserva("1");
		roomservice.setAddComents("Que sea de bellota");
		roomservice.setDate("Para manana");
		roomservice.setDescription("lo quiero ya");
		roomservice.setEstado("Finalizado");
		roomservice.setForClient("056985");
		roomservice.setForRoom("502");
		roomservice.setStatus("4");
		roomservice.setType("Compra de jamon");
		roomservicedao.create(roomservice);
		RoomService t = RoomServiceDAOImplementation.getInstance().read("1");
		assertEquals(t.getnReserva(),"1");
		assertEquals(t.getAddComents(),"Que sea de bellota");
		assertEquals(t.getDate(),"Para manana");
		assertEquals(t.getDescription(),"lo quiero ya");
		assertEquals(t.getEstado(),"Finalizado");
		assertEquals(t.getForClient(),"056985");
		assertEquals(t.getForRoom(),"502");
		assertEquals(t.getStatus(),"4");
		assertEquals(t.getType(),"Compra de jamon");
		roomservicedao.delete(t);
		
	}

	@Test
	void testUpdate() {
		RoomServiceDAO roomservicedao = RoomServiceDAOImplementation.getInstance();
		RoomService roomservice = new RoomService();
		roomservice.setnReserva("1");
		roomservice.setAddComents("Que sea de bellota");
		roomservice.setDate("Para manana");
		roomservice.setDescription("lo quiero ya");
		roomservice.setEstado("Entregando");
		roomservice.setForClient("056985");
		roomservice.setForRoom("502");
		roomservice.setStatus("4");
		roomservice.setType("Compra de jamon");
		roomservicedao.create(roomservice);
		RoomService t = RoomServiceDAOImplementation.getInstance().read("1");
		t.setAddComents("Quiero que sea de cebo");
		t.setForRoom("207");
		t.setEstado("Finalizado");
		RoomServiceDAOImplementation.getInstance().update(t);
		assertEquals(t.getForRoom(),"207");
		assertEquals(t.getAddComents(),"Quiero que sea de cebo");
		assertEquals(t.getEstado(),"Finalizado");
		roomservicedao.delete(t);
	}

	@Test
	void testDelete() {
		RoomServiceDAO roomservicedao = RoomServiceDAOImplementation.getInstance();
		RoomService roomservice = new RoomService();
		roomservice.setnReserva("1");
		roomservice.setAddComents("Que sea de bellota");
		roomservice.setDate("Para manana");
		roomservice.setDescription("lo quiero ya");
		roomservice.setEstado("Entregando");
		roomservice.setForClient("056985");
		roomservice.setForRoom("502");
		roomservice.setStatus("4");
		roomservice.setType("Compra de jamon");
		roomservicedao.create(roomservice);
		RoomService t = RoomServiceDAOImplementation.getInstance().read("1");
		roomservicedao.delete(t);
		assertNull(RoomServiceDAOImplementation.getInstance().read("1"));
	}

	@Test
	void testReadAll() {
		RoomServiceDAO roomservicedao = RoomServiceDAOImplementation.getInstance();
		RoomService roomservice = new RoomService();
		roomservice.setnReserva("1");
		roomservice.setAddComents("Que sea de bellota");
		roomservice.setDate("Para manana");
		roomservice.setDescription("lo quiero ya");
		roomservice.setEstado("Entregando");
		roomservice.setForClient("056985");
		roomservice.setForRoom("502");
		roomservice.setStatus("4");
		roomservice.setType("Compra de jamon");
		roomservicedao.create(roomservice);
		RoomService t = RoomServiceDAOImplementation.getInstance().read("1");
		List<RoomService> roomServices = (List<RoomService>) RoomServiceDAOImplementation.getInstance().readAll();
		assertEquals(roomServices.size(),1);
		roomservicedao.delete(t);
		List<RoomService> roomServices2 = (List<RoomService>) RoomServiceDAOImplementation.getInstance().readAll();
		assertEquals(roomServices2.size(),0);
	}

}

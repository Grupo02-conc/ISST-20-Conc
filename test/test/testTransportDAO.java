package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.upm.dit.isst.conc.dao.TransportDAO;
import es.upm.dit.isst.conc.dao.TransportDAOImplementation;
import es.upm.dit.isst.conc.model.Transport;

class testTransportDAO {


	@Test
	void testCreate() {		
		TransportDAO tdao = TransportDAOImplementation.getInstance();
		
		Transport t1 = new Transport();
		Transport t2 = new Transport();
		
		t1.setnReserva("1");
		t1.setDNI("11111111A");
		t1.setType("Taxi");
		t1.setDate("Jueves");
		t1.setDestination("Madrid");
		t1.setAddComments("Quiero pasar por Cibeles");
		t1.setStatus("1");
		t1.setEstado("Solicitado");
		
		assertEquals(t1.getnReserva(), "1");
		assertEquals(t1.getDNI(), "11111111A");
		assertEquals(t1.getType(), "Taxi");
		assertEquals(t1.getDate(), "Jueves");
		assertEquals(t1.getDestination(), "Madrid");
		assertEquals(t1.getAddComments(), "Quiero pasar por Cibeles");
		assertEquals(t1.getStatus(), "1");
		tdao.delete(t1);
		
		
		t2.setnReserva("2");
		t2.setDNI("22222222B");
		t2.setType("Helicoptero");
		t2.setDate("Hoy");
		t2.setDestination("Aeropuerto");
		t2.setAddComments("Quiero llegar antes de las 8 a.m.");
		t2.setStatus("1");
		t2.setEstado("Solicitado");
		
		assertEquals(t2.getnReserva(), "2");
		assertEquals(t2.getDNI(), "22222222B");
		assertEquals(t2.getType(), "Helicoptero");
		assertEquals(t2.getDate(), "Hoy");
		assertEquals(t2.getDestination(), "Aeropuerto");
		assertEquals(t2.getAddComments(), "Quiero llegar antes de las 8 a.m.");
		assertEquals(t2.getStatus(), "1");
		tdao.delete(t2);
		
	}

	@Test
	void testRead() {
		TransportDAO tdao = TransportDAOImplementation.getInstance();
		Transport t1 = new Transport();
		
		t1.setnReserva("1");
		t1.setDNI("11111111A");
		t1.setType("Taxi");
		t1.setDate("Jueves");
		t1.setDestination("Madrid");
		t1.setAddComments("Quiero pasar por Cibeles");
		t1.setStatus("1");
		t1.setEstado("Solicitado");
		
		tdao.create(t1);
		
		Transport t = TransportDAOImplementation.getInstance().read("1");
		
		assertEquals(t.getnReserva(), "1");
		assertEquals(t.getDNI(), "11111111A");
		assertEquals(t.getType(), "Taxi");
		assertEquals(t.getDate(), "Jueves");
		assertEquals(t.getDestination(), "Madrid");
		assertEquals(t.getAddComments(), "Quiero pasar por Cibeles");
		assertEquals(t.getStatus(), "1");
		tdao.delete(t);
	}

	@Test
	void testUpdate() {
		TransportDAO tdao = TransportDAOImplementation.getInstance();
		Transport t1 = new Transport();
		
		t1.setnReserva("1");
		t1.setDNI("11111111A");
		t1.setType("Taxi");
		t1.setDate("Jueves");
		t1.setDestination("Madrid");
		t1.setAddComments("Quiero pasar por Cibeles");
		t1.setStatus("1");
		t1.setEstado("Solicitado");
		
		tdao.create(t1);
		
		Transport t = TransportDAOImplementation.getInstance().read("1");
		t.setAddComments("Quiero pasar por el Bernabeu");
		t.setType("Helicoptero");
		TransportDAOImplementation.getInstance().update(t);
		
		assertEquals(t.getType(), "Helicoptero");
		assertEquals(t.getAddComments(), "Quiero pasar por el Bernabeu");

		tdao.delete(t);
		
	}

	@Test
	void testDelete() {
		TransportDAO tdao = TransportDAOImplementation.getInstance();
		Transport t1 = new Transport();
		
		t1.setnReserva("1");
		t1.setDNI("11111111A");
		t1.setType("Taxi");
		t1.setDate("Jueves");
		t1.setDestination("Madrid");
		t1.setAddComments("Quiero pasar por Cibeles");
		t1.setStatus("1");
		t1.setEstado("Solicitado");
		
		tdao.create(t1);
		
		Transport t = TransportDAOImplementation.getInstance().read("1");

		tdao.delete(t);
		
		assertNull(TransportDAOImplementation.getInstance().read("1"));
		
	}

	@Test
	void testReadAll() {
		TransportDAO tdao = TransportDAOImplementation.getInstance();
		Transport t1 = new Transport();
		
		t1.setnReserva("1");
		t1.setDNI("11111111A");
		t1.setType("Taxi");
		t1.setDate("Jueves");
		t1.setDestination("Madrid");
		t1.setAddComments("Quiero pasar por Cibeles");
		t1.setStatus("1");
		t1.setEstado("Solicitado");
		
		tdao.create(t1);
		
		Transport t = TransportDAOImplementation.getInstance().read("1");
		
		List<Transport> transports = (List<Transport>) TransportDAOImplementation.getInstance().readAll();
		assertEquals(transports.size(), 1);
		tdao.delete(t);
		List<Transport> transports2 = (List<Transport>) TransportDAOImplementation.getInstance().readAll();
		assertEquals(transports2.size(), 0);

	}

}

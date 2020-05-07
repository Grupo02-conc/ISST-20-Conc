package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;

import es.upm.dit.isst.conc.dao.OcioDAO;
import es.upm.dit.isst.conc.dao.OcioDAOImplementation;

import es.upm.dit.isst.conc.model.Ocio;


class OcioDAOImplementationTest {

	@Test
	void testCreate() {
		OcioDAO ociodao = OcioDAOImplementation.getInstance();
		
		Ocio ocio = new Ocio();
		ocio.setnReserva("1");
		ocio.setDni("1234");
		ocio.setActividad("Entrenador personal");
		ocio.setFecha("Hoy por la tarde");
		ocio.setPrecio("50 euros");
		ocio.setAddComents("Que trabaje en un gimnasio");
		ocio.setStatus("1");
		ocio.setEstado("Solicitado");
			
		ociodao.create(ocio);
		
		assertEquals(ocio.getnReserva(),"1");
		assertEquals(ocio.getDni(),"1234");
		assertEquals(ocio.getActividad(),"Entrenador personal");
		assertEquals(ocio.getFecha(),"Hoy por la tarde");
		assertEquals(ocio.getPrecio(),"50 euros");
		assertEquals(ocio.getAddComents(),"Que trabaje en un gimnasio");
		assertEquals(ocio.getStatus(),"1");
		assertEquals(ocio.getEstado(),"Solicitado");
		
		ociodao.delete(ocio);
		
	}

	@Test
	void testRead() {
		OcioDAO ociodao = OcioDAOImplementation.getInstance();
		Ocio ocio = new Ocio();
		ocio.setnReserva("1");
		ocio.setDni("1234");
		ocio.setActividad("Entrenador personal");
		ocio.setFecha("Hoy por la tarde");
		ocio.setPrecio("50 euros");
		ocio.setAddComents("Que trabaje en un gimnasio");
		ocio.setStatus("1");
		ocio.setEstado("Solicitado");
		
		ociodao.create(ocio);
		Ocio o = OcioDAOImplementation.getInstance().read("1");
		
		assertEquals(o.getnReserva(),"1");
		assertEquals(o.getDni(),"1234");
		assertEquals(o.getActividad(),"Entrenador personal");
		assertEquals(o.getFecha(),"Hoy por la tarde");
		assertEquals(o.getPrecio(),"50 euros");
		assertEquals(o.getAddComents(),"Que trabaje en un gimnasio");
		assertEquals(o.getStatus(),"1");
		assertEquals(o.getEstado(),"Solicitado");
		
		ociodao.delete(o);
	}

	@Test
	void testUpdate() {
		OcioDAO ociodao = OcioDAOImplementation.getInstance();
		Ocio ocio = new Ocio();
		
		ocio.setnReserva("1");
		ocio.setDni("1234");
		ocio.setActividad("Entrenador personal");
		ocio.setFecha("Hoy por la tarde");
		ocio.setPrecio("50 euros");
		ocio.setAddComents("Que trabaje en un gimnasio");
		ocio.setStatus("1");
		ocio.setEstado("Solicitado");
		
		ociodao.create(ocio);
		
		Ocio o = OcioDAOImplementation.getInstance().read("1");
		o.setAddComents("Quiero que sea del goFit");
		o.setActividad("Tirarse en paracaidas");
		OcioDAOImplementation.getInstance().update(o);
		
		
		assertEquals(o.getAddComents(),"Quiero que sea del goFit");
		assertEquals(o.getActividad(), "Tirarse en paracaidas");
		ociodao.delete(o);
		
	}

	@Test
	void testDelete() {
		OcioDAO ociodao = OcioDAOImplementation.getInstance();
		Ocio ocio = new Ocio();
		ocio.setnReserva("1");
		ocio.setDni("1234");
		ocio.setActividad("Entrenador personal");
		ocio.setFecha("Hoy por la tarde");
		ocio.setPrecio("50 euros");
		ocio.setAddComents("Que trabaje en un gimnasio");
		ocio.setStatus("1");
		ocio.setEstado("Solicitado");
		
		ociodao.create(ocio);
		Ocio o = OcioDAOImplementation.getInstance().read("1");
		
		ociodao.delete(o);
		assertNull(OcioDAOImplementation.getInstance().read("1"));
	}

	@Test
	void testReadAll() {
		OcioDAO ociodao = OcioDAOImplementation.getInstance();
		Ocio ocio = new Ocio();
		ocio.setnReserva("1");
		ocio.setDni("1234");
		ocio.setActividad("Entrenador personal");
		ocio.setFecha("Hoy por la tarde");
		ocio.setPrecio("50 euros");
		ocio.setAddComents("Que trabaje en un gimnasio");
		ocio.setStatus("1");
		ocio.setEstado("Solicitado");
		
		ociodao.create(ocio);
		
		Ocio o = OcioDAOImplementation.getInstance().read("1");
		
		List<Ocio> ocios = (List<Ocio>) OcioDAOImplementation.getInstance().readAll();
		assertEquals(ocios.size(),1);
		ociodao.delete(o);
		List<Ocio> ocios2 = (List<Ocio>) OcioDAOImplementation.getInstance().readAll();
		assertEquals(ocios2.size(),0);
	}

}

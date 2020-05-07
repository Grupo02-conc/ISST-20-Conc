package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.Test;

import es.upm.dit.isst.conc.dao.AyudaDAO;
import es.upm.dit.isst.conc.dao.AyudaDAOImplementation;
import es.upm.dit.isst.conc.model.Ayuda;

public class TestAyudaDAOImplementation {
	@Test
	void testCreate() {
		AyudaDAO ayudadao = AyudaDAOImplementation.getInstance();
		Ayuda ayuda = new Ayuda();
		ayuda.setnAyuda("1");
		ayuda.setDescripcion("Bebida");
		ayuda.setDni("50634277");
		ayuda.setStatus(1);
		ayuda.setEstado("Solicitado");
		ayudadao.create(ayuda);
		assertEquals(ayuda.getnAyuda(),"1");
		assertEquals(ayuda.getDescripcion(),"Bebida");
		assertEquals(ayuda.getDni(),"50634277");
		assertEquals(ayuda.getStatus(),1);
		assertEquals(ayuda.getEstado(),"Solicitado");
		ayudadao.delete(ayuda);
	}

	@Test
	void testRead() {
		AyudaDAO ayudadao = AyudaDAOImplementation.getInstance();
		Ayuda ayuda = new Ayuda();
		ayuda.setnAyuda("1");
		ayuda.setDescripcion("Bebida");
		ayuda.setDni("50634277");
		ayuda.setStatus(1);
		ayuda.setEstado("Solicitado");
		ayudadao.create(ayuda);
		Ayuda t = AyudaDAOImplementation.getInstance().read("Bebida");
		assertEquals(t.getnAyuda(),"1");
		assertEquals(t.getDescripcion(),"Bebida");
		assertEquals(t.getDni(),"50634277");
		assertEquals(t.getStatus(),1);
		assertEquals(t.getEstado(),"Solicitado");
		ayudadao.delete(t);
		
	}

	@Test
	void testUpdate() {
		AyudaDAO ayudadao = AyudaDAOImplementation.getInstance();
		Ayuda ayuda = new Ayuda();
		ayuda.setnAyuda("1");
		ayuda.setDescripcion("Bebida");
		ayuda.setDni("50634277");
		ayuda.setStatus(1);
		ayuda.setEstado("Solicitado");
		ayudadao.create(ayuda);
		Ayuda t = AyudaDAOImplementation.getInstance().read("Bebida");
		t.setStatus(2);
		t.setEstado("Cancelado");
		AyudaDAOImplementation.getInstance().update(t);
		assertEquals(t.getStatus(),2);
		assertEquals(t.getEstado(),"Cancelado");
		ayudadao.delete(t);
	}

	@Test
	void testDelete() {
		AyudaDAO ayudadao = AyudaDAOImplementation.getInstance();
		Ayuda ayuda = new Ayuda();
		ayuda.setnAyuda("1");
		ayuda.setDescripcion("Bebida");
		ayuda.setDni("50634277");
		ayuda.setStatus(1);
		ayuda.setEstado("Solicitado");
		ayudadao.create(ayuda);
		Ayuda t = AyudaDAOImplementation.getInstance().read("Bebida");
		ayudadao.delete(t);
		assertNull(AyudaDAOImplementation.getInstance().read("Bebida"));
	}

	@Test
	void testReadAll() {
		AyudaDAO ayudadao = AyudaDAOImplementation.getInstance();
		Ayuda ayuda = new Ayuda();
		ayuda.setnAyuda("1");
		ayuda.setDescripcion("Bebida");
		ayuda.setDni("50634277");
		ayuda.setStatus(1);
		ayuda.setEstado("Solicitado");
		ayudadao.create(ayuda);
		Ayuda t = AyudaDAOImplementation.getInstance().read("Bebida");
		List<Ayuda> ayudas = (List<Ayuda>) AyudaDAOImplementation.getInstance().readAll();
		assertEquals(ayudas.size(),1);
		ayudadao.delete(t);
		List<Ayuda> ayudas2 = (List<Ayuda>) AyudaDAOImplementation.getInstance().readAll();
		assertEquals(ayudas2.size(),0);
	}

}

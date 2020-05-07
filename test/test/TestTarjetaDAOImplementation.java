package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.Test;

import es.upm.dit.isst.conc.dao.TarjetaDAO;
import es.upm.dit.isst.conc.dao.TarjetaDAOImplementation;
import es.upm.dit.isst.conc.model.Tarjeta;

public class TestTarjetaDAOImplementation {
	@Test
	void testCreate() {
		TarjetaDAO Tarjetadao = TarjetaDAOImplementation.getInstance();
		Tarjeta Tarjeta = new Tarjeta();
		Tarjeta.setNumero("5025 4587 9658 5214");
		Tarjeta.setCaducidad("12-22");
		Tarjeta.setCodigo("257");
		Tarjeta.setDni("50634277");
		Tarjetadao.create(Tarjeta);
		assertEquals(Tarjeta.getNumero(),"5025 4587 9658 5214");
		assertEquals(Tarjeta.getCaducidad(),"12-22");
		assertEquals(Tarjeta.getCodigo(),"257");
		assertEquals(Tarjeta.getDni(),"50634277");
		Tarjetadao.delete(Tarjeta);
	}

	@Test
	void testRead() {
		TarjetaDAO Tarjetadao = TarjetaDAOImplementation.getInstance();
		Tarjeta Tarjeta = new Tarjeta();
		Tarjeta.setNumero("5025 4587 9658 5214");
		Tarjeta.setCaducidad("12-22");
		Tarjeta.setCodigo("257");
		Tarjeta.setDni("50634277");
		Tarjetadao.create(Tarjeta);
		Tarjeta t = TarjetaDAOImplementation.getInstance().read("5025 4587 9658 5214");
		assertEquals(t.getNumero(),"5025 4587 9658 5214");
		assertEquals(t.getCaducidad(),"12-22");
		assertEquals(t.getCodigo(),"257");
		assertEquals(t.getDni(),"50634277");
		Tarjetadao.delete(t);
		
	}

	@Test
	void testUpdate() {
		TarjetaDAO Tarjetadao = TarjetaDAOImplementation.getInstance();
		Tarjeta Tarjeta = new Tarjeta();
		Tarjeta.setNumero("5025 4587 9658 5214");
		Tarjeta.setCaducidad("12-22");
		Tarjeta.setCodigo("257");
		Tarjeta.setDni("50634277");
		Tarjetadao.create(Tarjeta);
		Tarjeta t = TarjetaDAOImplementation.getInstance().read("5025 4587 9658 5214");
		t.setCaducidad("11-23");
		t.setCodigo("352");
		TarjetaDAOImplementation.getInstance().update(t);
		assertEquals(t.getCaducidad(),"11-23");
		assertEquals(t.getCodigo(),"352");
		Tarjetadao.delete(t);
	}

	@Test
	void testDelete() {
		TarjetaDAO Tarjetadao = TarjetaDAOImplementation.getInstance();
		Tarjeta Tarjeta = new Tarjeta();
		Tarjeta.setNumero("5025 4587 9658 5214");
		Tarjeta.setCaducidad("12-22");
		Tarjeta.setCodigo("257");
		Tarjeta.setDni("50634277");
		Tarjetadao.create(Tarjeta);
		Tarjeta t = TarjetaDAOImplementation.getInstance().read("5025 4587 9658 5214");
		Tarjetadao.delete(t);
		assertNull(TarjetaDAOImplementation.getInstance().read("5025 4587 9658 5214"));
	}

	@Test
	void testReadAll() {
		TarjetaDAO Tarjetadao = TarjetaDAOImplementation.getInstance();
		Tarjeta Tarjeta = new Tarjeta();
		Tarjeta.setNumero("5025 4587 9658 5214");
		Tarjeta.setCaducidad("12-22");
		Tarjeta.setCodigo("257");
		Tarjeta.setDni("50634277");
		Tarjetadao.create(Tarjeta);
		Tarjeta t = TarjetaDAOImplementation.getInstance().read("5025 4587 9658 5214");
		List<Tarjeta> Tarjetas = (List<Tarjeta>) TarjetaDAOImplementation.getInstance().readAll();
		assertEquals(Tarjetas.size(),1);
		Tarjetadao.delete(t);
		List<Tarjeta> Tarjetas2 = (List<Tarjeta>) TarjetaDAOImplementation.getInstance().readAll();
		assertEquals(Tarjetas2.size(),0);
	}

}


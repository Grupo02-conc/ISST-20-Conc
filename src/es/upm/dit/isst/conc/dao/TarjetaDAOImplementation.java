package es.upm.dit.isst.conc.dao;

import java.util.Collection;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import es.upm.dit.isst.conc.model.Tarjeta;

public class TarjetaDAOImplementation implements TarjetaDAO {

	private static  TarjetaDAOImplementation instancia = null;
	private TarjetaDAOImplementation() {
	}

	public static TarjetaDAOImplementation getInstance() {
		if( null == instancia ) 
			instancia = new TarjetaDAOImplementation();
		return instancia;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void create(Tarjeta tarjeta) {
		  Session session = SessionFactoryService.get().openSession();
		  session.beginTransaction();
		  session.save(tarjeta);
		  session.getTransaction().commit();
		  session.close();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Tarjeta read(String numero) {
		  Session session = SessionFactoryService.get().openSession();
		  session.beginTransaction();
		  Tarjeta c = session.get(Tarjeta.class, numero);
		  session.getTransaction().commit();
		  session.close();
		return c;
	}

	@Override
	public void update(Tarjeta tarjeta) {
		  Session session = SessionFactoryService.get().openSession();
		  session.beginTransaction();
		  session.saveOrUpdate(tarjeta);
		  session.getTransaction().commit();
		  session.close();

	}

	@SuppressWarnings("unchecked")
	@Override
	public void delete(Tarjeta tarjeta) {
		  Session session = SessionFactoryService.get().openSession();
		  session.beginTransaction();
		  session.delete(tarjeta);
		  session.getTransaction().commit();
		  session.close();

	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Collection<Tarjeta> readAll() {
		  Session session = SessionFactoryService.get().openSession();
		  session.beginTransaction();
		  List<Tarjeta> tarjetas = session.createQuery("from Tarjeta").list();
		  session.getTransaction().commit();
		  session.close();
		return tarjetas;
	}

	

}

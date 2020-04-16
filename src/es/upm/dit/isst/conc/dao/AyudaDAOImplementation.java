package es.upm.dit.isst.conc.dao;

import java.util.Collection;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import es.upm.dit.isst.conc.model.Ayuda;

public class AyudaDAOImplementation implements AyudaDAO {

	private static  AyudaDAOImplementation instancia = null;
	private AyudaDAOImplementation() {
	}

	public static AyudaDAOImplementation getInstance() {
		if( null == instancia ) 
			instancia = new AyudaDAOImplementation();
		return instancia;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void create(Ayuda ayuda) {
		  Session session = SessionFactoryService.get().openSession();
		  session.beginTransaction();
		  session.save(ayuda);
		  session.getTransaction().commit();
		  session.close();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Ayuda read(String descripcion) {
		  Session session = SessionFactoryService.get().openSession();
		  session.beginTransaction();
		  Ayuda c = session.get(Ayuda.class, descripcion);
		  session.getTransaction().commit();
		  session.close();
		return c;
	}

	@Override
	public void update(Ayuda ayuda) {
		  Session session = SessionFactoryService.get().openSession();
		  session.beginTransaction();
		  session.saveOrUpdate(ayuda);
		  session.getTransaction().commit();
		  session.close();

	}

	@SuppressWarnings("unchecked")
	@Override
	public void delete(Ayuda ayuda) {
		  Session session = SessionFactoryService.get().openSession();
		  session.beginTransaction();
		  session.delete(ayuda);
		  session.getTransaction().commit();
		  session.close();

	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Collection<Ayuda> readAll() {
		  Session session = SessionFactoryService.get().openSession();
		  session.beginTransaction();
		  List<Ayuda> ayudas = session.createQuery("from Ayuda").list();
		  session.getTransaction().commit();
		  session.close();
		return ayudas;
	}

	

}

package es.upm.dit.isst.conc.dao;

import java.util.Collection;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import es.upm.dit.isst.conc.model.Ocio;
import es.upm.dit.isst.conc.model.Transport;

public class OcioDAOImplementation implements OcioDAO {
	private static  OcioDAOImplementation instancia = null;
	private OcioDAOImplementation() {
	}

	public static OcioDAOImplementation getInstance() {
		if( null == instancia ) 
			instancia = new OcioDAOImplementation();
		return instancia;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void create(Ocio ocio) {
		// TODO Auto-generated method stub
		Session session = SessionFactoryService.get().openSession();
		  session.beginTransaction();
		  session.save(ocio);
		  session.getTransaction().commit();
		  session.close();

	}

	@SuppressWarnings("unchecked")
	@Override
	public Ocio read(String dni) {
		// TODO Auto-generated method stub
		  Session session = SessionFactoryService.get().openSession();
		  session.beginTransaction();
		  Ocio p = session.get(Ocio.class, dni);
		  session.getTransaction().commit();
		  session.close();
		return p;
	}

	
	@Override
	public void update(Ocio ocio) {
		// TODO Auto-generated method stub
		 Session session = SessionFactoryService.get().openSession();
		  session.beginTransaction();
		  session.saveOrUpdate(ocio);
		  session.getTransaction().commit();
		  session.close();

	}

	@SuppressWarnings("unchecked")
	@Override
	public void delete(Ocio ocio) {
		// TODO Auto-generated method stub
		Session session = SessionFactoryService.get().openSession();
		  session.beginTransaction();
		  session.delete(ocio);
		  session.getTransaction().commit();
		  session.close();


	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<Ocio> readAll() {
		// TODO Auto-generated method stub
		Session session = SessionFactoryService.get().openSession();
		  session.beginTransaction();
		  List<Ocio> ocios = session.createQuery("from Ocio").list();
		  session.getTransaction().commit();
		  session.close();
		return ocios;
	}

	
	

}

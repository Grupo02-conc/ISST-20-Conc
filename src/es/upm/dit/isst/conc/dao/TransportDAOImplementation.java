package es.upm.dit.isst.conc.dao;

import java.util.Collection;
import java.util.List;
import org.hibernate.Session;
import es.upm.dit.isst.conc.model.Transport;

public class TransportDAOImplementation implements TransportDAO {

	private static  TransportDAOImplementation instancia = null;
	private TransportDAOImplementation() {
	}

	public static TransportDAOImplementation getInstance() {
		if( null == instancia ) 
			instancia = new TransportDAOImplementation();
		return instancia;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void create(Transport transport) {
		  Session session = SessionFactoryService.get().openSession();
		  session.beginTransaction();
		  session.save(transport);
		  session.getTransaction().commit();
		  session.close();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Transport read(String dni) {
		  Session session = SessionFactoryService.get().openSession();
		  session.beginTransaction();
		  Transport rm = session.get(Transport.class, dni);
		  session.getTransaction().commit();
		  session.close();
		return rm;
	}

	
	
	@Override
	public void update(Transport transport) {
		  Session session = SessionFactoryService.get().openSession();
		  session.beginTransaction();
		  session.saveOrUpdate(transport);
		  session.getTransaction().commit();
		  session.close();

	}

	@SuppressWarnings("unchecked")
	@Override
	public void delete(Transport transport) {
		  Session session = SessionFactoryService.get().openSession();
		  session.beginTransaction();
		  session.delete(transport);
		  session.getTransaction().commit();
		  session.close();

	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Collection<Transport> readAll() {
		  Session session = SessionFactoryService.get().openSession();
		  session.beginTransaction();
		  List<Transport> transports = session.createQuery("from Transport").list();
		  session.getTransaction().commit();
		  session.close();
		return transports;
	}


}


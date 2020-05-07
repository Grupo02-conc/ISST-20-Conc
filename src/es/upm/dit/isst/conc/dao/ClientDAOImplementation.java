package es.upm.dit.isst.conc.dao;

import java.util.Collection;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import es.upm.dit.isst.conc.model.Client;

public class ClientDAOImplementation implements ClientDAO {

	private static  ClientDAOImplementation instancia = null;
	private ClientDAOImplementation() {
	}

	public static ClientDAOImplementation getInstance() {
		if( null == instancia ) 
			instancia = new ClientDAOImplementation();
		return instancia;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void create(Client client) {
		  Session session = SessionFactoryService.get().openSession();
		  session.beginTransaction();
		  session.save(client);
		  session.getTransaction().commit();
		  session.close();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Client read(String email) {
		  Session session = SessionFactoryService.get().openSession();
		  session.beginTransaction();
		  Client c = session.get(Client.class, email);
		  session.getTransaction().commit();
		  session.close();
		return c;
	}

	@Override
	public void update(Client client) {
		  Session session = SessionFactoryService.get().openSession();
		  session.beginTransaction();
		  session.saveOrUpdate(client);
		  session.getTransaction().commit();
		  session.close();

	}

	@SuppressWarnings("unchecked")
	@Override
	public void delete(Client client) {
		  Session session = SessionFactoryService.get().openSession();
		  session.beginTransaction();
		  session.delete(client);
		  session.getTransaction().commit();
		  session.close();

	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Collection<Client> readAll() {
		  Session session = SessionFactoryService.get().openSession();
		  session.beginTransaction();
		  List<Client> clients = session.createQuery("from Client").list();
		  session.getTransaction().commit();
		  session.close();
		return clients;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Client login(String dni, String room) {
		  Session session = SessionFactoryService.get().openSession();
		  session.beginTransaction();
		  Client c = null;
		  Query q = session.createQuery("select c from Client c where c.dni = :dni and c.room = :room");
		  q.setParameter("dni", dni);
		  q.setParameter("room", room);
		  List<Client> clients = q.getResultList();
		  if (clients.size() > 0)
		  	c = (Client) (q.getResultList().get(0));

		  session.getTransaction().commit();
		  session.close();
		return c;
	}

}

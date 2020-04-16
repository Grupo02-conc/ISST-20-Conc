package es.upm.dit.isst.conc.dao;

import java.util.Collection;
import java.util.List;
import org.hibernate.Session;
import es.upm.dit.isst.conc.model.RoomService;

public class RoomServiceDAOImplementation implements RoomServiceDAO {

	private static  RoomServiceDAOImplementation instancia = null;
	private RoomServiceDAOImplementation() {
	}

	public static RoomServiceDAOImplementation getInstance() {
		if( null == instancia ) 
			instancia = new RoomServiceDAOImplementation();
		return instancia;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void create(RoomService roomService) {
		  Session session = SessionFactoryService.get().openSession();
		  session.beginTransaction();
		  session.save(roomService);
		  session.getTransaction().commit();
		  session.close();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public RoomService read(String nReserva) {
		  Session session = SessionFactoryService.get().openSession();
		  session.beginTransaction();
		  RoomService rm = session.get(RoomService.class, nReserva);
		  session.getTransaction().commit();
		  session.close();
		return rm;
	}

	
	
	@Override
	public void update(RoomService roomService) {
		  Session session = SessionFactoryService.get().openSession();
		  session.beginTransaction();
		  session.saveOrUpdate(roomService);
		  session.getTransaction().commit();
		  session.close();

	}

	@SuppressWarnings("unchecked")
	@Override
	public void delete(RoomService roomService) {
		  Session session = SessionFactoryService.get().openSession();
		  session.beginTransaction();
		  session.delete(roomService);
		  session.getTransaction().commit();
		  session.close();

	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Collection<RoomService> readAll() {
		  Session session = SessionFactoryService.get().openSession();
		  session.beginTransaction();
		  List<RoomService> roomServices = session.createQuery("from RoomService").list();
		  session.getTransaction().commit();
		  session.close();
		return roomServices;
	}


}



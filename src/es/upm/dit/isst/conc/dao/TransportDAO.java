package es.upm.dit.isst.conc.dao;

import java.util.Collection;

import es.upm.dit.isst.conc.model.Transport;

public interface TransportDAO {
	
		public void create(Transport transport);
		public Transport read(String dni);
		public void update(Transport transport);
		public void delete(Transport transport);
		public Collection<Transport> readAll();

}

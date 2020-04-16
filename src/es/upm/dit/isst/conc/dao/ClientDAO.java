package es.upm.dit.isst.conc.dao;

import java.util.Collection;

import es.upm.dit.isst.conc.model.Client;

public interface ClientDAO {
	public void create(Client client);
	public Client read(String email);
	public void update(Client client);
	public void delete(Client client);
	public Collection<Client> readAll();
	public Client login(String email, String psd);

}

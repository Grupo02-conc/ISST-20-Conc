package es.upm.dit.isst.conc.dao;

import java.util.Collection;

import es.upm.dit.isst.conc.model.Ayuda;

public interface AyudaDAO {
	public void create(Ayuda ayuda);
	public Ayuda read(String descripcion);
	public void update(Ayuda ayuda);
	public void delete(Ayuda ayuda);
	public Collection<Ayuda> readAll();

}

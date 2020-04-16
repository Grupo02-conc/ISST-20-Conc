package es.upm.dit.isst.conc.dao;

import java.util.Collection;

import es.upm.dit.isst.conc.model.Ocio;


public interface OcioDAO {
	public void create(Ocio ocio);
	public Ocio read(String dni);
	public void update(Ocio ocio);
	public void delete(Ocio ocio);
	public Collection<Ocio> readAll();
	
}

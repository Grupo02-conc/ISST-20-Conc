package es.upm.dit.isst.conc.dao;

import java.util.Collection;

import es.upm.dit.isst.conc.model.Tarjeta;

public interface TarjetaDAO {
	public void create(Tarjeta tarjeta);
	public Tarjeta read(String numero);
	public void update(Tarjeta tarjeta);
	public void delete(Tarjeta tarjeta);
	public Collection<Tarjeta> readAll();

}


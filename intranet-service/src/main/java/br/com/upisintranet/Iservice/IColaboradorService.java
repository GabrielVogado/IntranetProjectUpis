package br.com.upisintranet.Iservice;

import java.util.List;

import com.upisintranet.entity.Colaborador;

public interface IColaboradorService {

	long getColaboradorCount();

	List<Colaborador> getColaborador();

	Colaborador getColaborador(Long id);

	Colaborador postColaborador(Colaborador colaborador);

	Colaborador putColaborador(Long id, Colaborador colaborador);

	void deleteColaborador(Long id);

	long getCusosCount();
	
}

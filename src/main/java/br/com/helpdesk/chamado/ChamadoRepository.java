package br.com.helpdesk.chamado;

import org.springframework.data.repository.CrudRepository;

public interface ChamadoRepository extends CrudRepository<Chamado, Integer> {
	public Chamado findOneByChamadoId(Integer codigo);
}
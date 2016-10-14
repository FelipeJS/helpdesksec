package br.com.helpdesk.chamado;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chamado")
public class ChamadoController {

	@Autowired
	private ChamadoService chamadoService;

	@RequestMapping(value = "/consultar", method = GET)
	public Chamado consultar(@RequestParam Integer codigo) {
		return chamadoService.obterChamado(codigo);
	}

	@RequestMapping("/listar")
	public Iterable<Chamado> listar() {
		return chamadoService.obterTodos();
	}

	@RequestMapping(value = "/novo", method = POST)
	public Chamado novo(@RequestBody Chamado chamado) {
		return chamadoService.registrarChamado(chamado);
	}
}
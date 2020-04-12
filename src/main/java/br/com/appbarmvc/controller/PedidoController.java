package br.com.appbarmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.com.appbarmvc.model.negocio.Pedido;
import br.com.appbarmvc.model.service.PedidoService;

@Controller
@SessionAttributes("pedido")
public class PedidoController {

	@Autowired
	private PedidoService service;
	
	
	@RequestMapping(value = "/pedido", method = RequestMethod.GET)
	public String showDetalhe() {
		return "pedido/detalhe";
	}
	
	@RequestMapping(value = "/pedidos", method = RequestMethod.GET)
	public String obterLista(Model model) {
		
		model.addAttribute("pedidosLista", service.obterLista());
		
		return "pedido/lista";
	}
	
	@RequestMapping(value = "/pedido", method = RequestMethod.POST)
	public String incluir(
			Model model,
			Pedido pedido
			) {
		
		service.incluir(pedido);
		
		return this.obterLista(model);
	}
	
	@RequestMapping(value = "/pedido/excluir/{id}", method = RequestMethod.GET)
	public String excluir(
			Model model, 
			@PathVariable Integer id
			) {
		
		service.excluir(id);
		
		return this.obterLista(model);
	}

	public PedidoService getService() {
		return service;
	}
	public void setService(PedidoService service) {
		this.service = service;
	}
}
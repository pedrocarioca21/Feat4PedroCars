package code.com.appAgencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import code.com.appAgencia.model.domain.Carro;
import code.com.appAgencia.model.service.CarroService;


@Controller

public class CarroController {
	
	@Autowired
	private CarroService carrosService;
	
	@GetMapping(value = "/")
	public String inicializa() {
		return "index";
	}

	@GetMapping(value = "/telacadcarro")
	public String telaCadCarro() {
		return "carros/cadcarro";
	}
	
	@PostMapping(value = "/cadcarro")
	public String incluirCarro(Model model, Carro carro) {
		
		carrosService.incluirUsado(carro);
		
		model.addAttribute("mensagem", "Inclusão realizada com sucesso do "+carro.getPlaca());
		
		return obterUsados(model);
	}
	
	@GetMapping(value = "/consultarCarro")
	public String consultarCarro() {
		return "";
	}
	
	@GetMapping(value = "/delCarro/{id}/")
	public String excluirCarro(Model model, @PathVariable Integer id) {
		
		Carro carroExcluido = carrosService.obterUsadoPorId(id);
		
		carrosService.excluirUsado(id);
		
		model.addAttribute("mensagem", "Carro "+ carroExcluido.getPlaca() + ", excluído com sucesso!");
		
		return obterUsados(model);
	}
	
	@GetMapping(value = "/carros/todosusados")
	public String obterUsados(Model model) {
		
		model.addAttribute("usados", carrosService.obterListaCarros());
		
		return "carros/todosusados";
	}

}

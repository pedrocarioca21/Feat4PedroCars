package code.com.appAgencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import code.com.appAgencia.model.domain.Usuario;
import code.com.appAgencia.model.service.UsuarioService;

@Controller

public class UsuarioController {
	
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(value = "/telacadusuario")
	public String telaCadUsuario() {
		return "usuarios/cadusuario";
	}
	
	@GetMapping(value = "/usuarios/listausuario")
	public String obterUsuarios(Model model) {
		model.addAttribute("usuarios",usuarioService.obterListaUsuarios());
		return "usuarios/listausuario";
	}
		
	@PostMapping(value = "/usuarios/incluir")
	public String incluirUsuario(Usuario usuario, Model model) {
		
		usuarioService.incluirUsuario(usuario);
		
		model.addAttribute("mensagem", "Usuario " + usuario.getNome() +" cadastrado com sucesso.");
		
		return obterUsuarios(model);
		
	}
	
	@GetMapping(value = "/delUsuario/{id}/")
	public String excluirUsuario(Model model, @PathVariable Integer id) {
		
		Usuario excluido = usuarioService.obterUsarioPorId(id);
		
		usuarioService.excluirUsuario(id);
		
		model.addAttribute("mensagem", "Usuário "+ excluido.getNome() + ", excluído com sucesso!");
		
		return obterUsuarios(model);
		
		
	}

}

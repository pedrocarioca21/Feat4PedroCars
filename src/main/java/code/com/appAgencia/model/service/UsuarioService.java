package code.com.appAgencia.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import code.com.appAgencia.model.domain.Usuario;
import code.com.appAgencia.model.repository.UsuarioRepository;

@Service

public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public List<Usuario> obterListaUsuarios(){			
		
		return (List<Usuario>) usuarioRepository.findAll(Sort.by(Sort.Direction.ASC,"nome"));
	}
	
	public void incluirUsuario(Usuario usuario) {
		
		usuarioRepository.save(usuario);
		
	}
	
	public void excluirUsuario(Integer id) {
		
		usuarioRepository.deleteById(id);
		
	}
	
	public Usuario obterUsarioPorId(Integer id) {
		
		return usuarioRepository.findById(id).orElse(null);
		
	}
	
}

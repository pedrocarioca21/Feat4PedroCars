package code.com.appAgencia.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import code.com.appAgencia.model.domain.Carro;
import code.com.appAgencia.model.repository.CarroRepository;

@Service

public class CarroService {
	
	@Autowired
	private CarroRepository carroRepository;
	
	public List<Carro> obterListaCarros(){			
		
		return (List<Carro>) carroRepository.findAll(Sort.by(Sort.Direction.ASC,"anoMod"));
	}
	
	public List<Carro> obterListaCarros(String sortBy){			
		
		return (List<Carro>) carroRepository.findAll(Sort.by(Sort.Direction.ASC,sortBy));
	}
	
	public void incluirUsado(Carro usado) {
		
		carroRepository.save(usado);
		
	}
	
	public void excluirUsado(Integer id) {
		
		carroRepository.deleteById(id);
		
	}
	
	public Carro obterUsadoPorId(Integer id) {
		
		return carroRepository.findById(id).orElse(null);
		
	}
	
}

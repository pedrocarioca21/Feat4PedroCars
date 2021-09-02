package code.com.appAgencia.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import code.com.appAgencia.model.domain.Carro;

@Repository
public interface CarroRepository extends CrudRepository<Carro, Integer> {
	
	List<Carro> findAll(Sort sort);

}

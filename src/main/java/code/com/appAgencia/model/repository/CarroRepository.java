package code.com.appAgencia.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import code.com.appAgencia.model.domain.Carro;

@Repository
public interface CarroRepository extends CrudRepository<Carro, Integer> {

}

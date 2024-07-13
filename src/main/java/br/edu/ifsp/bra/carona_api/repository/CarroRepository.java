package br.edu.ifsp.bra.carona_api.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.ifsp.bra.carona_api.model.Carro;

public interface CarroRepository extends CrudRepository<Carro, Long>{
    
}

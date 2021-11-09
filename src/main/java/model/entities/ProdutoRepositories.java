package model.entities;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepositories extends CrudRepository<Produto, Integer> {

}

package emerson.lab_padroes_projeto_spring.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface que define o padrão de acesso ao banco de dados para a entidade
 * Endereco. Com a anotação @Repository, essa interface será tratada como um
 * Bean do Spring, podendo ser injetada em outras classes.
 */

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}
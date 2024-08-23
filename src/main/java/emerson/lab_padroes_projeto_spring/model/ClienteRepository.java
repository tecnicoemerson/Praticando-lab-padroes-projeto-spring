package emerson.lab_padroes_projeto_spring.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface que define o padrão de acesso ao banco de dados para a entidade
 * Cliente. Com a anotação @Repository, essa interface será tratada como um
 * Bean do Spring, podendo ser injetada em outras classes.
 *
 * A interface CrudRepository, do Spring Data JPA, define os seguintes
 * métodos para acesso ao banco de dados:
 *
 * - save(S var1): Salva um registro na base de dados.
 * - findOne(ID var1): Busca um registro na base de dados pelo seu ID.
 * - findAll(): Busca todos os registros na base de dados.
 * - count(): Retorna a quantidade de registros na base de dados.
 * - delete(ID var1): Apaga um registro na base de dados pelo seu ID.
 * - delete(S var1): Apaga um registro na base de dados.
 * - deleteAll(): Apaga todos os registros na base de dados.
 *
 * Além disso, o Spring Data JPA ainda permite que sejam definidos outros
 * métodos de acesso ao banco de dados, utilizando a nomenclatura de
 * métodos do Spring Data JPA.
 */

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
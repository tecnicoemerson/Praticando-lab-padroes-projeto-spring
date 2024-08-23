package emerson.lab_padroes_projeto_spring.service;

import emerson.lab_padroes_projeto_spring.model.Cliente;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma
 * interface.
 */
public interface ClienteService {

    Iterable<Cliente> buscarTodos();
    /**
     * Busca todos os clientes existentes no domínio.
     * @return Iterável de clientes.
     */

    Cliente buscarPorId(Long id);
    /**
     * Busca um cliente pelo seu ID.
     * ID do cliente.
     * @return Cliente correspondente ao ID informado.
     */

    void inserir(Cliente cliente);
    /**
     * Inserção de um novo cliente no domínio.
     *cliente Novo cliente a ser inserido.
     */

    void atualizar(Long id, Cliente cliente);
    /**
     * Atualização de um cliente pelo seu ID.
     * id ID do cliente a ser atualizado.
     *  cliente Novos dados do cliente.
     */

    void deletar(Long id);
    /**
     * Remoção de um cliente pelo seu ID.
     *ID do cliente a ser removido.
     */
}
package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;

public interface ClienteService {

	/**
	 * Buscar todos os Clientes
	 * @return Iterable - Clientes no sistema
	 */
	Iterable<Cliente> buscarTodos();

	/**
	 * Buscar Cliente por ID
	 * @param id Long - ID do cliente
	 * @return Client - Cliente com ID correspondente
	 */
	Cliente buscarPorId(Long id);

	/**
	 * Insere um novo cliente
	 * @param cliente Cliente - Cliente a ser inserido
	 */
	void inserir(Cliente cliente);

	/**
	 * Buscar Cliente por ID, caso exista, atualiza o cliente
	 * @param id - ID do cliente
	 * @param cliente Cliente - Atualização
	 */
	void atualizar(Long id, Cliente cliente);

	/**
	 * Deletar Cliente por ID
	 * @param id - ID do cliente a ser deletado
	 */
	void deletar(Long id);

}

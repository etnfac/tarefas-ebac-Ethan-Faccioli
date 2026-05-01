package br.com.efaccioli.dao;

import br.com.efaccioli.domain.Cliente;
import java.util.Collection;

/**
 * @author ethan.faccioli
 */

public interface IClienteDAO {
public boolean cadastrar(Cliente cliente);

public void excluir(Long cpd);
public void alterar(Cliente cliente);
public Cliente consultar (long cpf);
public Collection<Cliente> buscarTodos();
}
package Repositorio;

import java.util.List;

import Entidades.Pessoa;

public interface IRepositorioPessoa {

	
	public boolean salvaPessoa(Pessoa pessoa);
	public boolean deletarPessoaPorID(long id);
	public List<Pessoa> listarPessoa(); 
	public boolean alteraPessoa(Pessoa pessoa);
	
}

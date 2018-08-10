//Primeira etapa de teste do CRUD, realizada com sucesso!

import java.util.ArrayList;
import java.util.List;

import Entidades.Pessoa;
import Repositorio.RepositorioPessoa;

public class Teste {
	public static RepositorioPessoa rp = new RepositorioPessoa();
	public static void main(String[] args) {
		
		popularArray();
		listarPessoas();
		rp.deletarPessoaPorID(2);
		listarPessoas();
		alterar();
		listarPessoas();
	}
	
	public static void alterar() {
		
		Pessoa pessoa = new Pessoa ();
		pessoa.setApelido("Loco");
		pessoa.setId(3);
		pessoa.setIdade(72);
		pessoa.setNome("OnesíforoLOCO");
		rp.alteraPessoa(pessoa);
	
	}
	
	public static void popularArray() {
		
		
		Pessoa pessoa1 = new Pessoa ();
		pessoa1.setApelido("Veterano");
		pessoa1.setId(1);
		pessoa1.setIdade(18);
		pessoa1.setNome("Nathan");
		rp.salvaPessoa(pessoa1);
		
		Pessoa pessoa2 = new Pessoa ();
		pessoa2.setApelido("Coroa");
		pessoa2.setId(2);
		pessoa2.setIdade(36);
		pessoa2.setNome("Carla");
		rp.salvaPessoa(pessoa2);
	
		Pessoa pessoa = new Pessoa ();
		pessoa.setApelido("Loco");
		pessoa.setId(3);
		pessoa.setIdade(72);
		pessoa.setNome("Onesíforo");
		rp.salvaPessoa(pessoa);
	
		//após esta parte, salvará as informações no banco 
	}
		
	public static void listarPessoas() {
		List<Pessoa> lista = new ArrayList<Pessoa>();
		
		lista = rp.listarPessoa();
		
		for (Pessoa pessoa : lista) {
			
			System.out.println("Id :" +pessoa.getId());
			System.out.println("Nome :" +pessoa.getNome());
			System.out.println("Apelido :"+pessoa.getApelido());
			System.out.println("Idade :"+pessoa.getIdade());
			System.out.println("-----------------------------------");
		}
	}
}

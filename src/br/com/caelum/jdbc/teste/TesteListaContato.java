package br.com.caelum.jdbc.teste;

import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TesteListaContato {

	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao();
		List<Contato> contatoList = dao.lista();
		for(Contato aux : contatoList){
			System.out.println("ID = " + aux.getId());
			System.out.println("Nome = " + aux.getNome());
			System.out.println("Email = " + aux.getEmail());
			System.out.println("Endereço = " + aux.getEndereco());
			System.out.println("Data de Nascimento = " + aux.getDataNascimento().getTime() + "\n");
			
		}
	}
}

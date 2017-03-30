package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TesteInsereContato {
	public static void main(String[] args) {
		Contato c = new Contato();
		c.setNome("Taciana Cristina");
		c.setEmail("tatha@gmail.com");
		c.setEndereco("Rua Mariana Jacinta");
		c.setDataNascimento(Calendar.getInstance());
		
		ContatoDao dao = new ContatoDao();
		dao.adiciona(c);
		System.out.println("Contato gravado!");
		
	}

}

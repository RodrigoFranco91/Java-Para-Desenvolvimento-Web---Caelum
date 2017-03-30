package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TesteAlteraContato {
	public static void main(String[] args) {
		Contato c = new  Contato();
		c.setId(2L);
		c.setNome("Taciana Cristina da Silva");
		c.setEmail("TacianaCristina@gmail.com");
		c.setEndereco("Rua Miguel Saponara");
		c.setDataNascimento(Calendar.getInstance());
		
		ContatoDao dao = new ContatoDao();
		dao.altera(c);
	}
}

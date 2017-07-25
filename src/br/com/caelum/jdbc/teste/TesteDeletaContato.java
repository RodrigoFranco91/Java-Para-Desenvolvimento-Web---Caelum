package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TesteDeletaContato {
	public static void main(String[] args) {
		Contato c = new Contato();
		c.setId(2L);
		ContatoDao dao = new ContatoDao();
		dao.deleta(c);
	}
}

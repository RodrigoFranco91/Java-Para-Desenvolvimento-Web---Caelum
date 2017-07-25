package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TesteDeletaFuncionario {
	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		f.setId(2L);

		FuncionarioDao dao = new FuncionarioDao();
		dao.deleta(f);
	}
}

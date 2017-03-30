package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TesteAlteraFuncionario {
	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		f.setId(1L);
		f.setNome("Gracielma Lima");
		f.setUsuario("GraLima");
		f.setSenha("159357");

		FuncionarioDao dao = new FuncionarioDao();
		dao.altera(f);
	}
}

package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TesteAdicionaFuncionario {
	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		f.setNome("Marlene");
		f.setUsuario("Mah");
		f.setSenha("963");
		
		FuncionarioDao dao = new FuncionarioDao();
		dao.adiciona(f);
	}
}

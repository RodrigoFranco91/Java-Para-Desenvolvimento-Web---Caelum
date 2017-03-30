package br.com.caelum.jdbc.teste;

import java.util.List;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TesteFuncionarioLista {
	public static void main(String[] args) {
		FuncionarioDao dao = new FuncionarioDao();
		List<Funcionario> funcionarioList = dao.lista();
		for (Funcionario aux : funcionarioList) {
			System.out.println("Id = " + aux.getId());
			System.out.println("Nome = " + aux.getNome());
			System.out.println("Usuario = " + aux.getUsuario());
			System.out.println("Senha = " + aux.getSenha() + '\n');
		}
	}

}

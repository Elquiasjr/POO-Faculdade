package lista07.exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Locadora {

	List<Cliente> clientes;
	List<Filme> filmes;
	
	public Locadora() {
		this.clientes = new ArrayList<Cliente>();
		this.filmes = new ArrayList<Filme>();
	}
	
	public void adicionarFilme(String titulo, int duracao, double preco) {
		filmes.add(new Filme(titulo, duracao, preco));
	}
	
	public void adicionarCliente(String nome, String dataNascimento, String telefone, Endereco endereco, String cpf,
			Dependente dependente) {
		clientes.add(new Socio(nome, dataNascimento, telefone, endereco, cpf, dependente));
	}
	
	public void adicionarCliente(String nome, String dataNascimento, String telefone, Endereco endereco) {
		clientes.add(new Dependente(nome, dataNascimento, telefone, endereco));
	}
	
	public void adicionarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void adicionarCliente(Dependente dependente) {
		clientes.add(dependente);
	}
	
	public void alocarFilme(String titulo, String nome, int diaAlocacao) {
		for(Cliente cliente: clientes) {
			if(cliente.nome.equals(nome)) {
				for(Filme filme: filmes) {
					if(filme.getTitulo().equals(titulo)) {
						cliente.realizarAlocacao(cliente, filme, diaAlocacao);	
						return;
					}
				}
				System.out.println("Filme não encontrado!");
				return;
			}
		}
		System.out.println("Cliente não encontrado!");
	}
	
	public void devolverFilme(String titulo, String nome, int diaDevolucao) {
		for(Cliente cliente: clientes) {
			if(cliente.nome.equals(nome)) {
				for(Filme filme: filmes) {
					if(filme.getTitulo().equals(titulo)) {
						cliente.realizarDevolucao(cliente, filme, diaDevolucao);	
						return;
					}
				}
				System.out.println("Filme não encontrado!");
				return;
			}
		}
		System.out.println("Cliente não encontrado!");
	}

	public Dependente getClientes(int i) {
		return (Dependente) clientes.get(i);
	}
	
	
	
}

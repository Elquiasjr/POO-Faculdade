package lista07.exercicio4;

public class Dependente extends Cliente{

	public Dependente(String nome, String dataNascimento, String telefone, Endereco endereco) {
		super(nome, dataNascimento, telefone, endereco);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizarAlocacao(Cliente cliente, Filme filme, int diaAlocacao) {
		if(filme.realizarLocacaoFilme(cliente, diaAlocacao)) {
			this.filme = filme;
		}
		else {
			System.out.println("Falha na Alocação!\n");
		}
	}

	@Override
	public void realizarDevolucao(Cliente cliente, Filme filme, int diaDevolucao) {
		if(filme.realizarDevolucaoFilme(diaDevolucao)) {
			this.filme = null;
		}
		else {
			System.out.println("Falha na Devolucao!\n");
		}
		
	}

	public String toString() {
		return "Dependente [nome=" + nome + ", dataNascimento=" + dataNascimento + ", telefone=" + telefone
				+ ", endereco=" + endereco + ", filme=" + filme + "]";
	}
	
	
}

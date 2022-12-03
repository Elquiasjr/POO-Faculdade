package lista07.exercicio4;

public class Filme {

	private String titulo;
	private int duracao;
	private double preco;
	private int diaLocacao;
	private int diaPrevisto;
	private Cliente cliente;
	private double valorTotal;
	private double valorMulta;
	private boolean disponibilidade;
	
	
	public Filme(String titulo, int duracao, double preco) {
		this.titulo = titulo;
		this.duracao = duracao;
		this.preco = preco;
		this.valorTotal = 0;
		this.valorMulta = 2;
		this.disponibilidade = true;
	}

	public boolean realizarLocacaoFilme(Cliente cliente, int diaAlocacao) {
		if(this.disponibilidade == true) {
			this.cliente = cliente;
			this.disponibilidade = false;
			this.diaLocacao = diaAlocacao;
			this.diaPrevisto = diaAlocacao + 3;
			System.out.println("Livro emprestado com sucesso!");
			return true;
		}
		else {
			System.out.println("Filme já alocado por: " + cliente.nome);
			return false;
		}
	}
	
	public boolean realizarDevolucaoFilme(int diaDevolucao) {
		if(this.disponibilidade == false) {
			this.disponibilidade = true;
			int atraso = diaDevolucao - this.diaPrevisto ;
			this.valorTotal = (this.preco + (this.valorMulta*(atraso <= 0? 0: atraso)));
			System.out.println("O valor da locação foi: R$" + this.valorTotal + " . Devolução realizada com sucesso!");
			System.out.println(this);
			this.cliente = null;
			return true;
		}
		else {
			System.out.println("Filme não alocado!");
			return false;
		}
	}

	
	
	@Override
	public String toString() {
		return "Filme [titulo=" + titulo + ", duracao=" + duracao + ", preco=" + preco + ", diaLocacao=" + diaLocacao
				+ ", diaPrevisto=" + diaPrevisto + ", valorTotal=" + valorTotal + ", nome do Cliente: " + cliente.getNome()
				+ ", valorMulta=" + valorMulta + ", disponibilidade=" + disponibilidade + "]";
	}

	public String getTitulo() {
		return titulo;
	}

	public int getDuracao() {
		return duracao;
	}

	public double getPreco() {
		return preco;
	}

	public int getDiaLocacao() {
		return diaLocacao;
	}

	public int getDiaPrevisto() {
		return diaPrevisto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public double getValorMulta() {
		return valorMulta;
	}

	public boolean isDisponibilidade() {
		return disponibilidade;
	}
	
}

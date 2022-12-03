package lista07.exercicio3;

public enum Titulacao {

	MESTRE("Mestrado", 1000),
	DOUTOR("Doutorado", 2000);
	
	private String nome;
	private double valorGratificacao;
	
	Titulacao(String nome, int valorGratificacao) {
		this.nome = nome;
		this.valorGratificacao = valorGratificacao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getValorGratificacao() {
		return valorGratificacao;
	}
	
}

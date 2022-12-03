package lista07.exercicio4;

public abstract class Cliente {
	protected String nome;
	protected String dataNascimento;
	protected String telefone;
	protected Endereco endereco;
	protected Filme filme;
	
	
	public Cliente(String nome, String dataNascimento, String telefone, Endereco endereco) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	public abstract void realizarAlocacao(Cliente cliente, Filme filme, int diaAlocacao);
	public abstract void realizarDevolucao(Cliente cliente, Filme filme, int diaDevolucao);
	public String getNome() {
		return nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public String getTelefone() {
		return telefone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public Filme getFilme() {
		return filme;
	}
	
	
	//public abstract String toString();
	
	
}

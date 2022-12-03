package lista07.exercicio4;

public class Endereco {

	private String logradouro;
	private int numero;
	private String bairro;
	private String cep;
	private String cidade;
	private String uf;
	
	public Endereco(String logradouro, int numero, String bairro, String cep, String cidade, String uf) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
	}

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", numero=" + numero + ", bairro=" + bairro + ", cep=" + cep
				+ ", cidade=" + cidade + ", uf=" + uf + "]";
	}
	
	
	
}

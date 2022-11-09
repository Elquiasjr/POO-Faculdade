package aula11.exercicio2;

public class Endereco {

	private String logradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String unidadeFederativa;
	
	
	public Endereco(String logradouro, int numero, String bairro, String cidade, String unidadeFederativa) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.unidadeFederativa = unidadeFederativa;
	}


	@Override
	public String toString() {
		return "Endereco logradouro: " + logradouro + ", numero=" + numero + ", bairro=" + bairro + ", cidade=" + cidade
				+ ", unidadeFederativa=" + unidadeFederativa;
	}
	
	
}

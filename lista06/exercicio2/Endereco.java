package lista06.exercicio2;

public class Endereco {
	private String logradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String unidadeFederativa;
	
	
	public Endereco(String logradouro, int numero, String bairro, String cidade, String unidadeFederativa) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.unidadeFederativa = unidadeFederativa;
	}


	public String getLogradouro() {
		return logradouro;
	}


	public int getNumero() {
		return numero;
	}


	public String getBairro() {
		return bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public String getUnidadeFederativa() {
		return unidadeFederativa;
	}


	@Override
	public String toString() {
		return "logradouro: " + logradouro + ", numero: " + numero + ", bairro: " + bairro + "\ncidade: " + cidade
				+ ", unidadeFederativa: " + unidadeFederativa;
	}
		
}

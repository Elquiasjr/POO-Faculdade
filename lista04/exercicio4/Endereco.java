package lista04.exercicio4;


/*Implemente um sistema que manterá o registro de animais de um petshop. Cada animal é
identificado pelo seu nome, idade e sexo. Além disso, sabe-se que cada animal possui um
dono o qual é identificado pelo cpf, nome, telefone e email, além de possuir um endereço que
será utilizado quando for necessário buscar o animal. O endereço é formado pelo logradouro,
número, bairro, cidade e estado. Além disso, cada animal pode realizar um tratamento no
petshop, então é importante manter essa informação relacionada ao animal. O tratamento é
identificado pela descrição, data do início e data do fim do mesmo. Algumas informações
podem não ser necessárias no momento da criação do tratamento, como por exemplo, a data
do fim do mesmo, podendo ser adicionado em uma data futura.*/

public class Endereco {
	
	private String logradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	
	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", numero=" + numero + ", bairro=" + bairro + ", cidade=" + cidade
				+ ", estado=" + estado + "]";
	}

	public Endereco(String logradouro, int numero, String bairro, String cidade, String estado) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	
}

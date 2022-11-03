package lista04.exercicio4;

/*Implemente um sistema que manterá o registro de animais de um petshop. Cada animal é
identificado pelo seu nome, idade e sexo. Além disso, sabe-se que cada animal possui um
dono o qual é identificado pelo cpf, nome, telefone e email, além de possuir um endereço que
será utilizado quando for necessário buscar o animal. O endereço é formado pelo logradouro,
número, bairro, cidade e estado. Além disso, cada animal pode realizar um tratamento no
petshop, então é importante manter essa informação relacionada ao animal. 
O tratamento é identificado pela descrição, data do início e data do fim do mesmo. Algumas informações
podem não ser necessárias no momento da criação do tratamento, como por exemplo, a data
do fim do mesmo, podendo ser adicionado em uma data futura.*/

public class Tratamento {

	private String descricao;
	private String dataInicio;
	private String dataFim;
	
	
	public Tratamento(String descricao, String dataInicio) {
		this(descricao, dataInicio, "");
	}

	public Tratamento(String descricao, String dataInicio, String dataFim) {
		super();
		this.descricao = descricao;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}
	
	public void AdicionarDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	@Override
	public String toString() {
		return "Tratamento [descricao=" + descricao + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + "]";
	}
	
	
}

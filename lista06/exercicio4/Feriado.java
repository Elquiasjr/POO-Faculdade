package lista06.exercicio4;

/*Construa uma classe chamada Feriado que deve herdar da classe Data.
o Variável-membro chamada “descricao” que deve ser do tipo String;
o Construtor que não recebe parâmetros
▪ Chama o construtor-pai correspondente
▪ Inicializa descricao com “Feriado”
o Construtor recebendo uma String para a descrição
▪ Chama construtor pai-correspondente;
▪ Atribui valor recebido à variável-membro descricao
o Construtor recebendo valores para dia, mês, ano e descrição
▪ Chama construtor pai-correspondente
▪ Atribui valor recebido à variável-membro descricao
o Método toString que retorna uma String com os valores de Data no seguinte formato:
▪ dia/mês/ano – descrição.*/

public class Feriado extends Data {
	private String descricao;

	public Feriado() {
		super();
		this.descricao = "Feriado";
	}

	public Feriado(String descricao) {
		super();
		this.descricao = descricao;
	}

	public Feriado(String dia, String mes, String ano, String descricao) {
		super(dia, mes, ano);
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Feriado - " + dia + "/" + mes + "/" + ano + " - " + descricao ;
	}
	
	
	
	
	
	
	
	
}

package lista06.exercicio4;

/*• Construa a classe Data com os seguintes métodos:
o Construtores recebendo todos os parâmetros (dia, mês e ano).
o Construtor recebendo como parâmetros valor para mês e ano, e então chamar o construtor
anterior passando o dia com o valor padrão: 1.
o Construtor recebendo somente o valor do dia.
▪ Chamar o construtor completo, passando por parâmetro o valor do dia recebido, além dos
valores padrão: 01 para mês e 2019 para ano.
o Construtor não recebendo parâmetros.
▪ Chamar o construtor completo, passando os valores:
• Dia = 01;
• Mês = 01;
• Ano = 2019.
o Método toString que retorna uma String com os valores de Data, no seguinte formato:
▪ dia/mês/ano.*/

public class Data {
	protected String dia;
	protected String mes;
	protected String ano;
	
	public Data(String dia, String mes, String ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data(String mes, String ano) {
		this("01", mes, ano);
	}
	
	public Data(String dia) {
		this(dia, "01", "2019");
	}
	
	public Data() {
		this("01","01","2019");
	}

	@Override
	public String toString() {
		return "Data - " + dia + "/" + mes + "/" + ano;
	}
	
	
	
}

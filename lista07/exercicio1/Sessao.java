package lista07.exercicio1;
/**
 * Implemente um sistema para um cinema controlar as sessões que estão ocorrendo. A Sessão é
identificada por uma data, horário e número de ingressos. Além disso, a Sessão possui uma Sala e um
Filme. A Sala é identificada por um número de identificação e a sua capacidade máxima. O Filme é
identificado pelo seu título e duração (minutos).

 */
public class Sessao {
	private String data;
	private String horario;
	private int numIngresso;
	
	private Sala sala;
	private Filme filme;
	
	public Sessao(String data, String horario, int numIngresso, Sala sala, Filme filme) {
		super();
		this.data = data;
		this.horario = horario;
		this.numIngresso = numIngresso;
		this.sala = sala;
		this.filme = filme;
	}
	
	public Sessao(String data, String horario, int numSala, int capacidadeMaxima, String titulo, int duracao) {
		this.data = data;
		this.horario = horario;
		this.numIngresso = capacidadeMaxima;
		this.sala = new Sala(numSala, capacidadeMaxima);
		this.filme = new Filme(titulo, duracao);
	}

	public String getData() {
		return data;
	}

	public String getHorario() {
		return horario;
	}

	public int getNumIngresso() {
		return numIngresso;
	}

	public Sala getSala() {
		return sala;
	}

	public Filme getFilme() {
		return filme;
	}
	
	public void setNumIngresso(int numIngresso) {
		this.numIngresso = numIngresso;
	}
	
	public void venderIngressoSessao(int ingressosVendidos) {
		if(this.getNumIngresso() > ingressosVendidos) {
			this.setNumIngresso(this.getNumIngresso() - ingressosVendidos );
			System.out.println("Venda realizada com sucesso! Numero de ingressos disponíveis: " + this.getNumIngresso());
		}
		else {
			System.out.println("Quantidade insuficiente de ingressos disponíveis! Falha na venda, numero de ingressos disponíveis: " + this.getNumIngresso());
		}
	}

	public void imprimirRelatorioSessao() {
		System.out.println("Sessao - Data:" + getData() + "\nHorario: " + getHorario() + "\nNumero de Ingressos: "
				+ getNumIngresso() + "\nSala: " + getSala() + "\nFilme: " + getFilme());
	}	
	
}

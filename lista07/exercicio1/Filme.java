package lista07.exercicio1;
/**
 * Implemente um sistema para um cinema controlar as sessões que estão ocorrendo. A Sessão é
identificada por uma data, horário e número de ingressos. Além disso, a Sessão possui uma Sala e um
Filme. A Sala é identificada por um número de identificação e a sua capacidade máxima. O Filme é
identificado pelo seu título e duração (minutos).

 */
public class Filme {
	private String titulo;
	private int duracao;
	
	public Filme(String titulo, int duracao) {
		this.titulo = titulo;
		this.duracao = duracao;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getDuracao() {
		return duracao;
	}

	
	@Override
	public String toString() {
		return "Titulo: " + titulo + "\nDuracao: " + duracao;
	}
	
	
}

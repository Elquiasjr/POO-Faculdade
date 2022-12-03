package lista07.exercicio1;
/**
 * Implemente um sistema para um cinema controlar as sessões que estão ocorrendo. A Sessão é
identificada por uma data, horário e número de ingressos. Além disso, a Sessão possui uma Sala e um
Filme. A Sala é identificada por um número de identificação e a sua capacidade máxima. O Filme é
identificado pelo seu título e duração (minutos).
 */
public class Sala {
	private int numSala;
	private int capacidadeMaxima;
	
	public Sala(int numSala, int capacidadeMaxima) {
		super();
		this.numSala = numSala;
		this.capacidadeMaxima = capacidadeMaxima;
	}

	public int getNumSala() {
		return numSala;
	}

	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}

	@Override
	public String toString() {
		return "Numero da Sala: " + numSala + "\nCapacidade Maxima: " + capacidadeMaxima;
	}
	
	
}

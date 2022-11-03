package lista04.exercicio5;

/* Além disso, o local que será realizado o evento é identificado pelo
nome do local, endereço e capacidade máxima. Por sua vez, o endereço é formado pelos
atributos: logradouro, número, bairro, cidade e estado. O número de ingressos disponíveis
para cada evento deve ser inicializado com a capacidade máxima do local onde o evento será
realizado. Para realizar a instanciação e invocação dos métodos do sistema, implemente uma
classe de teste*/

public class Local {
	private String nomeLocal;
	private Endereco endereco;
	private int capacidadeMaxima;
	
	public Local(String nomeLocal, Endereco endereco, int capacidadeMaxima) {
		super();
		this.nomeLocal = nomeLocal;
		this.endereco = endereco;
		this.capacidadeMaxima = capacidadeMaxima;
	}

	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}
	

}

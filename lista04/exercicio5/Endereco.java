package lista04.exercicio5;

/* Por sua vez, o endereço é formado pelos atributos: logradouro, número, bairro, cidade e estado. O número de ingressos disponíveis
para cada evento deve ser inicializado com a capacidade máxima do local onde o evento será
realizado. Para realizar a instanciação e invocação dos métodos do sistema, implemente uma
classe de teste*/

public class Endereco {
	
	private String logradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	
	public Endereco(String logradouro, int numero, String bairro, String cidade, String estado) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	
}

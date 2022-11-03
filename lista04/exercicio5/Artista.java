package lista04.exercicio5;

/* Como citado, um evento é realizado por um artista, este é identificado pelo nome,
nacionalidade e biografia. Além disso, o local que será realizado o evento é identificado pelo
nome do local, endereço e capacidade máxima. Por sua vez, o endereço é formado pelos
atributos: logradouro, número, bairro, cidade e estado. O número de ingressos disponíveis
para cada evento deve ser inicializado com a capacidade máxima do local onde o evento será
realizado. Para realizar a instanciação e invocação dos métodos do sistema, implemente uma
classe de teste*/

public class Artista {

	private String nome;
	private String nacionalidade;
	private String biografia;
	
	public Artista(String nome, String nacionalidade, String biografia) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.biografia = biografia;
	}
	
}

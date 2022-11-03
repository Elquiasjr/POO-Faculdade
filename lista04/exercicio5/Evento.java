package lista04.exercicio5;

/*Desenvolva um sistema para controlar a venda de ingressos de eventos. Cada evento é
identificado pelo nome do evento, artista que se apresentará, data que ocorrerá, local e
classificação etária, além disso, deverá ser possível realizar a venda de ingressos para o
evento, desde que haja ingressos disponíveis. Para realizar a venda é necessário receber o
número de ingressos que se deseja realizar a venda, se este número não ultrapassar a
quantidade de ingressos disponíveis, a venda então poderá ser concretizada, caso contrário,
não. Como citado, um evento é realizado por um artista, este é identificado pelo nome,
nacionalidade e biografia. Além disso, o local que será realizado o evento é identificado pelo
nome do local, endereço e capacidade máxima. Por sua vez, o endereço é formado pelos
atributos: logradouro, número, bairro, cidade e estado. O número de ingressos disponíveis
para cada evento deve ser inicializado com a capacidade máxima do local onde o evento será
realizado. Para realizar a instanciação e invocação dos métodos do sistema, implemente uma
classe de teste*/

public class Evento {

	private String nomeEvento;
	private Artista artista;
	private String dataEvento;
	private Local local;
	private String classificacaoEtaria;
	private int quantIngresso;
	
	
	public Evento(String nomeEvento, Artista artista, String dataEvento, Local local, String classificacaoEtaria) {
		super();
		this.nomeEvento = nomeEvento;
		this.artista = artista;
		this.dataEvento = dataEvento;
		this.local = local;
		this.classificacaoEtaria = classificacaoEtaria;
		this.quantIngresso = local.getCapacidadeMaxima();
	}



	public void VenderIngresso(int quantVenda) {
		if(quantVenda > quantIngresso) {
			System.out.println("Venda não efetuaada. Quantidade de ingresso insuficiente!" + "\n");
		}
		else {
			//System.err.println("errado");
			this.quantIngresso -= quantVenda;
			System.out.println("Venda efetuada. Quantidade total de ingressos: " + quantIngresso + "\n");
		}
	}
	
}

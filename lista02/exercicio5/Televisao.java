package lista02.exercicio5;

/*
 * Desenvolva um sistema para uma televisão. A televisão possui uma marca, polegadas e
resolução. Sabe-se que a TV pode ligar, desligar, alterar o canal para cima, alterar o canal
para baixo, aumentar volume e abaixar volume do som. Ao invocar o método para alterar o
canal para cima, será acrescentado 1 ao canal atual, como por exemplo, se a TV está
sintonizada no canal 15, ao selecionar a funcionalidade alterar canal para cima, o canal
selecionado passará a ser o 16, se invocado novamente, passará a ser o 17, e assim por
diante. Essa regra vale para as outras funcionalidades como: alterar canal para baixo e
aumento e diminuição de volume do som. Além disso, deve ser possível exibir um relatório
contendo todos os dados da TV, como marca, polegadas, resolução, canal que está
sintonizada e volume atual do som. Para efetuar a instanciação da televisão, definição dos
valores de seus atributos e invocação de métodos, utilize uma classe de teste.
*/

public class Televisao {
	
	String marca, polegada, resolucao;
	private int canal = 0, volume = 0;
	private boolean estado = false;
	
	
	
	public Televisao(String marca, String polegada, String resolucao, int canal, int volume, boolean estado) {
		super();
		this.marca = marca;
		this.polegada = polegada;
		this.resolucao = resolucao;
		this.canal = canal;
		this.volume = volume;
		this.estado = estado;
	}

	public void ligar() {
		System.out.println("A tv está ligada");
		estado = true;
	}
	
	public void desligar() {
		System.out.println("A tv está desligada");
		estado = false;
	}
	
	public void alterarCanalCima() {
		if(estado == true) {
			canal += 1;
		}
		else {
			System.out.println("Televisão desligada!");
		}
	}
	
	public void alterarCanalBaixo() {
		if(estado == true) {
			canal -= 1;
		}
		else {
			System.out.println("Televisão desligada!");
		}
	}
	
	public void aumentarVolume() {
		if(estado == true) {
			volume += 1;
		}
		else {
			System.out.println("Televisão desligada!");
		}
	}
	
	public void diminuirVolume() {
		if(estado == true) {
			canal += 1;
		}
		else {
			System.out.println("Televisão desligada!");
		}
	}
	
	public void exibirRelatorio() {
		System.out.println("Marca: " + marca + ", Polegada: " + polegada + ", Resolucao: " + resolucao + ", Canal: " + canal + ", Volume: " + volume);
	}
}

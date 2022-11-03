package lista02.exercicio3;

/*
 * Desenvolva um sistema para manter registros de notebook. Sabe-se que cada notebook é
identificado por uma marca, modelo, polegadas da tela, modelo do processador, quantidade
de memória ram e capacidade de armazenamento. Como comportamento, cada notebook
pode ligar, desligar, processar informações e conectar à internet. Ao invocar os métodos de
um determinado notebook, o sistema deve exibir uma mensagem da ação realizada pelo
notebook, como por exemplo: ao invocar o método ligar a mensagem “<modelo do notebook>
está ligando.” deve ser mostrada, ao invocar o método processar informações a mensagem
“<modelo do notebook está processando informações” deve ser exibida, entre outras. Para
instanciar objetos, atribuir os valores para cada notebook e invocar os métodos de cada um,
declare uma classe de teste que conterá o método main.
*/

public class Notebook {
	String marca, modelo, modeloProcessador;
	double memoriaRam, capacidadeArmazenamento, polegadasTela;
	
	public Notebook(String marca, String modelo, String modeloProcessador, double memoriaRam, double capacidadeArmazenamento, double polegadasTela) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.modeloProcessador = modeloProcessador;
		this.memoriaRam = memoriaRam;
		this.capacidadeArmazenamento = capacidadeArmazenamento;
		this.polegadasTela = polegadasTela;
	}

	public void ligar() {
		System.out.println(modelo + " está ligando");
	}
	
	public void desligar() {
		System.out.println(modelo + " está desligando");
	}
	
	public void processarInfo() {
		System.out.println(modelo + " está processando informação");
	}
	
	public void conectarInternet() {
		System.out.println(modelo + " está conectando a internet");
	}

	@Override
	public String toString() {
		return "Notebook marca: " + marca + ", modelo: " + modelo + ", modeloProcessador: " + modeloProcessador
				+ ", memoriaRam: " + memoriaRam + ", capacidadeArmazenamento: " + capacidadeArmazenamento
				+ ", polegadasTela: " + polegadasTela;
	}
	
	
}

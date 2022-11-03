package lista02.exercicio1;

/*
Desenvolva um sistema para controlar um carro. Sabe-se que o carro é identificado pelo seu
modelo, marca, cor, ano, renavam, chassi e placa. Além disso, o carro pode ligar, desligar,
acelerar e frear. Ao invocar os métodos do carro, o mesmo deverá exibir o que está ocorrendo,
como por exemplo, ao invocar o método ligar, deve-se exibir uma mensagem: “<modelo do
carro> está ligando”. Ao ser invocado o método acelerar, deve exibir: “<modelo do carro> está
acelerando”, e assim por diante. Utilize uma classe de teste para instanciar vários carros,
atribuir seus respectivos valores e invocar os métodos de cada um.
 * */

public class Carro {

	String modelo, marca, cor, renavam, chassi, placa;
	private boolean ligado = false;
	double velocidade = 0;
	
	
	
	public Carro(String modelo, String marca, String cor, String renavam, String chassi, String placa) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
		this.renavam = renavam;
		this.chassi = chassi;
		this.placa = placa;
	}

	public void ligar() {
		if(ligado == false) {
			System.out.println(modelo + " está ligando");
			ligado = true;
		}
		else {
			System.out.println(modelo + " já está ligado");
		}
	}
	
	public void desligar() {
		if(ligado == true) {
			System.out.println(modelo + " está desligando");
			ligado = false;
			velocidade = 0;
		}
		else {
			System.out.println(modelo + " já está desligado");
		}
	}
	
	
	public void acelerar(double velocidade) {
		if(ligado == true) {
			System.out.println(modelo + " está acelerando");
			this.velocidade += velocidade;
		}
		else {
			System.out.println(modelo + " o carro deve estar ligado");
		}
	}
	
	public void frear(double velocidade) {
		if(ligado == true) {
			System.out.println(modelo + " está freando");
			this.velocidade -= velocidade;
			if(this.velocidade <= 0) {
				System.out.println(modelo + " parou");
			}
		}
		else {
			System.out.println(modelo + " o carro deve estar ligado");
		}
	}
	
	
}

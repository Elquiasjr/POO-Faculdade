package aula03;

public class Carro {
	
	String marca;
	String modelo;
	int ano;
	String placa;
	String cor;
	boolean ligado = false; // true = ligado, false = desligado
	int velocidade = 0;
	
	
	public void ligar() {
		ligado = true;	
	}
	
	public void desligar() {
		ligado = false;
	}
	
	public void acelerar() {
		if (ligado == true) {
			velocidade += 10;
			System.out.println(marca + " acelerando");
		}
		else {
			System.out.println(marca + " está desligado");
		}
		
	}
	
	public void frear() {
		velocidade -= 10;
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", placa=" + placa + ", cor=" + cor
				+ ", ligado=" + ligado + ", velocidade=" + velocidade + "]";
	}
	
}

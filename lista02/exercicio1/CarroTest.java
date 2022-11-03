package lista02.exercicio1;

public class CarroTest {
	public static void main(String[] args) {
		Carro carro01 = new Carro("Gol", "Wolksvagem", "Prata", "68690389280", "aweasr12345as",  "fra12a8");
		Carro carro02 = new Carro("Uno", "Fiat", "Branco", "86029891210", "aasdf543as",  "asd-583");
		Carro carro03 = new Carro("Ford Gt", "Pegeout", "Prata", "29205957739", "aweasr12345as",  "fra12a8");
		
		carro01.ligar();
		carro01.acelerar(30);
		carro01.frear(20);
		carro01.desligar();
		carro02.acelerar(100);
		carro02.frear(0);
		carro03.ligar();
		carro03.acelerar(100);
		carro03.frear(100);
		carro03.desligar();
	}
}

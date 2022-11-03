package lista05.exercicio4;

public class EstacionamentoTeste {
	
	public static void main(String[] args) {
		Estacionamento garajao = new Estacionamento();
		garajao.adicionarVaga(1);
		garajao.adicionarVaga(2);
		garajao.adicionarVaga(3);
		garajao.adicionarVaga(4);
		garajao.adicionarVaga(5);
		
		garajao.registrarCarro(1, "5B7H90", 4);
		garajao.registrarCarro(2, "6O05V6", 5);
		garajao.removerCarro(1, 6);
		garajao.removerCarro(2, 22);
		
	}
	
}

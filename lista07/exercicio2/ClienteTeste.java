package lista07.exercicio2;

public class ClienteTeste {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Ruan Barreto","32345342");
		
		cliente1.adicionarPratoEntradaCliente(1, "Coração de Gado", "Coração de bois", 55);
		//cliente1.adicionarPratoPrincipalCliente(2, "Costela na Frigideira", "Costela", 45);
		//cliente1.adicionarSobremesaCliente(3, "Sorvete", "Sorteve", 10);
		
		cliente1.fecharConta();

	}

}

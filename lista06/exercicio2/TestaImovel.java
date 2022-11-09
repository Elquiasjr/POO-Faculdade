package lista06.exercicio2;

public class TestaImovel {
	public static void main(String[] args) {
		Endereco endereco = new Endereco("Rua das Casas", 11, "Cidade Velha", "Ponta Grossa","PR");
		ImovelNovo imovelNovo1 = new ImovelNovo(40, endereco, 10);
		
		ImovelVelho imovelVelho1 = new ImovelVelho(40, endereco, 10);
		
		imovelNovo1.imprimirRelatorio();

		System.out.println(imovelVelho1);
	}

}

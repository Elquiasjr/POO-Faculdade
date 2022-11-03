package lista04.exercicio4;

public class Main {

	public static void main(String[] args) {
		Tratamento tratamento1 = new Tratamento("Banho e tosa", "20/10/2022");
		Endereco endereco1 = new Endereco("Rua dos Pilares", 23, "Nova Russia", "Dois Vizinhos", "Santa Catarina");
		Dono dono1 = new Dono("Rafael Perinha", "(32) 993712343", "rafapina@gmail.com", "546.323.657-90", endereco1);
		Animal animal1 = new Animal("Brutos", 7, "Transgenero", dono1, tratamento1);
		
		System.out.println(animal1);
		tratamento1.AdicionarDataFim("25/10/2022");
		System.out.println(animal1);
	}

}

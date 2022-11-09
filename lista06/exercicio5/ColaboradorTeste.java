package lista06.exercicio5;

public class ColaboradorTeste {
	public static void main(String[] args) {
		Empregado empregado1 = new Empregado("Ruan Barros", "Rua dos Girassois - 11", "30/01/2022", "Cortador de Cana", 1000, 109);
		System.out.println(empregado1);

		Estagiario estagiario1 = new Estagiario("Pontes Carlos", "Avenida Buraco - 3221", "09/02/2022", "Golpista", 9000, 3231);
		System.out.println(estagiario1);
		
		Autonomo autonomo1 = new Autonomo("Luan Pinho", "Rua Carroça - 132", "14/06/2021", 500, "Limpa Brisa", 03221345422);
		System.out.println(autonomo1);
		
		Empresa empresa1 = new Empresa("Carros Mar", "Rua Mengão - s/n", "09/05/2010", 100, "Administrador Excel", 0234232345);
		System.out.println(empresa1);
	}

}

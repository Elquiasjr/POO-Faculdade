package lista07.exercicio4;

public class LocadoraTeste {

	public static void main(String[] args) {
		Locadora locadora = new Locadora();
		
		Endereco endereco = new Endereco("Rua dos Carneiros", 44, "Cidade Antiga", "432323-121", "Petrópolis", "RJ");

		locadora.adicionarCliente("Raul Kone", "23/09/2001", "(90) 99993-3212", endereco);
		locadora.adicionarCliente("Thiago Alves", "15/09/1982", "(87) 99942-8932", endereco, "992329123-1", locadora.getClientes(0));
		
		locadora.adicionarFilme("Sexta feira 17", 133, 14.5);
		locadora.adicionarFilme("Little mermaid", 122, 30);
		
		locadora.alocarFilme("Sexta feira 17", "Raul Kone", 4);
		locadora.devolverFilme("Sexta feira 17", "Raul Kone", 10);
		
		locadora.alocarFilme("Little mermaid", "Thiago Alves", 15);
		locadora.devolverFilme("Little mermaid", "Thiago Alves", 17);
		
	}

}

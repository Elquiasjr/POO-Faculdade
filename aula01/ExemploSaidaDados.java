package aula01;

public class ExemploSaidaDados {
	
	public static void main(String[] args) {
		
		String disciplina = "POO";
		String nomeProfessor = "Vinicius";
		
		System.out.println("Universidade Tecnológica Federal do Paraná");
		System.out.println("Programação Orientada a Objeto");
		
		System.out.println(disciplina + " ministrada pelo Prof. " + nomeProfessor);
		
		System.out.print("Universidade Tecnológica Federal do Paraná\n");
		System.out.print("Programação Orientada a Objeto\n");
		
		System.out.print(disciplina + " ministrada pelo Prof. " + nomeProfessor);
		System.out.print("\n");
		
		System.out.println("Universidade Tecnológica Federal do Paraná");
		System.out.println("Programação Orientada a Objeto");
		
		System.out.printf("%s ministrada pelo Prof. %s", disciplina, nomeProfessor);
	}
}

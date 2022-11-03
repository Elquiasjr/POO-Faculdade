package lista04.exercicio2;

public class Main {
	public static void main(String[] args) {
	Professor saulo = new Professor(554431, "Saulo", "5/9/1982", 9134.5);
	
	Disciplina estruturaDados = new Disciplina(1123, "Estrutura de Dados 2", "Presencial", "120h", saulo);	
	
	estruturaDados.ImprimirDisciplina();
	}

}

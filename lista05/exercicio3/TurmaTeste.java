package lista05.exercicio3;

public class TurmaTeste {

	public static void main(String[] args) {
		Turma poo = new Turma("Programação Orientada a Objetos");
		
		poo.adicionarAluno(2354332, "Henrique Paulo", 6, 10, 9, 5);
		poo.adicionarAluno(2343121, "Pablo Flores", 8, 10, 9, 7);
		poo.adicionarAluno(2398323, "Andre Kombi", 6, 10, 7, 10);
		
		poo.calcularMediaAluno();
		
		poo.calcularMediaTurma();
		
	}
}

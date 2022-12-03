package lista07.exercicio3;

public class SalarioTeste {

	public static void main(String[] args) {
		Processo processo = new Processo(1, "20/02/2001", "Criação de processos");
		Disciplina disciplina = new Disciplina(2, "Física 1", 90);

		Professor professor = new Professor(21321, "Elton Welzon", "04/05/2010", 21000, Titulacao.DOUTOR, disciplina);
		Professor professor1 = new Professor(00001, "Maria Tina", "10/12/2023", 14000, Titulacao.MESTRE, disciplina);
		
		professor.calcularSalario();
		professor1.calcularSalario();
		
		professor.imprimirRelatorio();
		
		TecnicoAdm tecnico = new TecnicoAdm(00002, "Gustavo Fritz", "09/01/2014", 4000, 1000, processo);
		
		tecnico.calcularSalario();
		
		tecnico.imprimirRelatorio();
		
	}

}

package aula11.exercicio2;

public class Main {

	public static void main(String[] args) {
		Endereco endereco = new Endereco("Rua das Rosas", 44, "Centro", "Ponta Grossa", "PR");
		
		Professor professor1 = new Professor("Erikson", 90, endereco, 22000);
		Aluno aluno1 = new Aluno("Jonathan", 19, endereco, "Ciência da computação");
		
		System.out.println(professor1);
		
		System.out.println(aluno1);
	}

}

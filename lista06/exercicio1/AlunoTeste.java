package lista06.exercicio1;

/*Crie uma classe AlunoTeste onde (i) deverá ser criado um objeto do tipo pessoa, com suas
informações, (ii) invoque o método para imprimir as informações do objeto pessoa, (iii) deverá ser criado
um objeto aluno, com suas informações e (iv) invoque o método para imprimir as informações do objeto
aluno.*/

public class AlunoTeste {
	public static void main(String[] args) {
			Aluno aluno1 = new Aluno("Lucas Barros", "21/08/2001", 31923341, 1233432);
			
			aluno1.imprimirInfo();
			
			Aluno aluno2 = new Aluno("Felipe Fialho", "01/12/2002", 6753452, 1234345);
			
			aluno2	.imprimirInfo();
	}

}

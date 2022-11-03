package lista05.exercicio3;
/*são identificados pelo seu número de RA e nome, além de
cada aluno possuir um total de 4 notas (double).*/
public class Aluno {
	private int ra;
	private String nomeAluno;
	private double[] notas = new double[4];
	
	public Aluno(int ra, String nomeAluno, double[] notas) {
		super();
		this.ra = ra;
		this.nomeAluno = nomeAluno;
		this.notas = notas;
	}
	
	public void CalcularMedia() {
		double somaNotas = 0;
		for(int i = 0; i < 4; i++) {
			somaNotas += this.notas[i];
		}
		System.out.println("A média do alunos " + nomeAluno + " é: " + somaNotas/4 + "\n" );
	}
	
	public double CalcularMediaRetorno() {
		double somaNotas = 0;
		for(int i = 0; i < 4; i++) {
			somaNotas += this.notas[i];
		}
		return somaNotas/4;
	}

	public int getRa() {
		return ra;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public double[] getNotas() {
		return notas;
	}
	
	
}

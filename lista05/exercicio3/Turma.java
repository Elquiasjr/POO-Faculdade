package lista05.exercicio3;

import java.util.List;
import java.util.ArrayList;

/*
 * Desenvolva um sistema para gerenciar a turma de Programação Orientada a Objetos. Esta turma
possui um nome e um total de 5 alunos que são identificados pelo seu número de RA e nome, além de
cada aluno possuir um total de 4 notas (double). Atribua um RA, nome e 4 notas para cada um dos 5
alunos. Neste sistema será possível calcular a média aritmética de cada aluno e a média aritmética da
turma, sendo que cada cálculo deve ficar em sua respectiva classe. Porém, o cálculo da média de cada
aluno só poderá ser invoca da classe Turma, pois é ela quem detém os alunos. O método que calculará
a média de cada aluno deve imprimir o resultado do cálculo seguido da situação do aluno (Aprovado
ou Reprovado) de acordo com sua nota. Adote que a média igual ou superior a 6.0 o aluno é
considerado aprovado, caso contrário, reprovado. O método da média da turma imprimirá o nome da
turma e o resultado do cálculo da média. Para inicializar o sistema, realizar as verificações de alunos
aprovados e média da turma, utilize a classe TurmaTeste.class.
 * */

public class Turma {
	
	private String nomeTurma;
	private List<Aluno> alunos;
	
	public Turma(String nomeTurma) {
		super();
		this.nomeTurma = nomeTurma;
		this.alunos = new ArrayList<Aluno>();
	}
	
	public void AdicionarAluno(int ra, String nomeAluno, double nota1, double nota2, double nota3, double nota4) {
		Aluno aluno = new Aluno(ra, nomeAluno, new double[]{nota1, nota2, nota3, nota4});
		alunos.add(aluno);
	}
	
	public void CalcularMediaAluno() {
		for(Aluno aluno: alunos) {
			aluno.CalcularMedia();
		}
	}
	
	public void CalcularMediaTurma() {
		double somaMedias = 0;
		for(Aluno aluno: alunos) {
			somaMedias += aluno.CalcularMediaRetorno();
		}
		System.out.println("O valor da Media da turma é: " + somaMedias/alunos.size() + "\n");
	}
	
	
}

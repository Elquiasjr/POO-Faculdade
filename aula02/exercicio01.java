package aula02;

import java.util.Scanner;

public class exercicio01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira seu nome completo: ");
		String nomeCompleto = scan.nextLine(), sexo, estadoCivil, escolaridade;
		//scan.nextLine();

		System.out.println("Insira seu sexo: ");
		sexo = scan.nextLine();
		//scan.nextLine();
		
		System.out.println("Insira seu estado civil: ");
		estadoCivil = scan.nextLine();
	
		System.out.println("Insira o numero de filhos que voce tem: ");
		int numFilhos = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Insira sua escolaridade: ");
		escolaridade = scan.nextLine();
		
		System.out.println("Insira sua renda mensal: ");
		float rendaMensal = scan.nextInt();
		
		System.out.println("Seu nome: " + nomeCompleto + ", \nSeu sexo: " + sexo + ", \nSeu estado civil: " + estadoCivil + ", \nSeu numero de filhos: " + numFilhos + ", \nSua escolaridade: " + escolaridade + ", \nSua renda mensal: " + rendaMensal );
		
		scan.close();
		
		
	}

}

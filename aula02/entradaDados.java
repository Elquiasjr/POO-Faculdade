package aula02;

import java.util.Scanner;

public class entradaDados {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe nome: ");
		String nome = scan.nextLine();
		//System.out.println(nome);
		
		System.out.println("Informe idade: ");
		int idade = scan.nextInt();
		//System.out.println(idade);
		
		System.out.println("Informe peso: ");
		double peso = scan.nextDouble();
		//System.out.println(peso);
		
		
		System.out.println(nome + " possui " + idade + " anos e " + peso + "kg.");
		scan.close();
		
	}
	
}

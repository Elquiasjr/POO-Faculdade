package aula02;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		/*Desenvolva um sistema que receberá o valor total da
		compra.
		Se o valor for maior ou igual a R$50,00, calcule um
		desconto de 10%. Caso contrário, calcule um desconto de
		5%.
		Apresente o valor de desconto em tela.
		Utilize o conceito de operador ternário para resolução do
		exercício. 
		 */
		
		Scanner scanner = new Scanner(System.in);
		double totalCompra = scanner.nextDouble();
		double descontoValor = totalCompra > 50? 0.9: 0.95;
		System.out.printf("O valor do desconto: %.0f%%, e o total com desconto: R$%.02f", (1 - descontoValor)*100, descontoValor * totalCompra);
		
		scanner.close();
	}

}

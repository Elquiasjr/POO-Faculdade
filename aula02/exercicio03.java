package aula02;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner scam = new Scanner(System.in);
		int num1 = scam.nextInt(), num2 = scam.nextInt(), num3 = scam.nextInt();
		
		boolean num1Greater2 = num1 > num2, num1Greater3 = num1 > num3, num2Greater3 = num2 > num3;
		
		if(num1Greater2 && num1Greater3) {
			System.out.println(num1);
		}
		else if(num2Greater3) {
			System.out.println(num2);
		}
		else {
			System.out.println(num3);
		}

		scam.close();
	}

}

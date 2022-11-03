package aula02;

public class exercicio02 {

	public static void main(String[] args) {
		
		float a = 1, b = 3 , c = 1;
		float delta = (float)Math.pow(b, 2f) - 4 * a * c;
		float x = (float)(-b + Math.sqrt(delta))/2*a, xNega = (float)(-b - Math.sqrt(delta))/2*a;
		System.out.printf("Primeira solucao: %f\nSegunda solucao: %f", x, xNega);
	}
}

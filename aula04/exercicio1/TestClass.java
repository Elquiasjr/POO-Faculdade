package aula04.exercicio1;

public class TestClass {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente(1, "Joao", "22/09/67", EstadoCivil.SOLTEIRO);
		System.out.println(cliente1);
		cliente1.SetEstadoCivil(EstadoCivil.CASADO);
		System.out.println(cliente1);
	}
}

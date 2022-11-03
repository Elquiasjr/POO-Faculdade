package lista05.exercicio4;

public class Veiculo {

	private String placa;
	private int horaInicial;
	
	public Veiculo(String placa, int horaInicial) {
		super();
		this.placa = placa;
		this.horaInicial = horaInicial;
		}
	
	public void removerVeiculo(int horaFinal) {
		double valor = 0;
		if(horaFinal - horaInicial <= 3) {
			System.out.println("Vaga desocupada. Não há cobranças!\n");
		}
		else {
			valor = (horaFinal - horaInicial)*0.5;
			System.out.println("Vaga desocupada. Valor a cobrar: " + valor);
		}
	}
}

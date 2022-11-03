package lista05.exercicio4;

public class Vaga {

	private Veiculo veiculo;
	private int numeroVaga;
	
	public Vaga(int numeroVaga) {
		super();
		this.numeroVaga = numeroVaga;
	}
	
	public void registrarCarroVaga(String placa, int horaInicial) {
		if(veiculo == null) {
			Veiculo veiculo = new Veiculo(placa, horaInicial);
			this.veiculo = veiculo;
			System.out.println("Vaga registrada!\n");
		}
		else {
			System.out.println("Vaga ocupada!\n");
		}
		
	}
	
	public void removerCarroVaga(int horaFinal) {
		veiculo.removerVeiculo(horaFinal);
		this.veiculo = null;
	}
	
	public int getNumeroVaga() {
		return numeroVaga;
	}
	
}

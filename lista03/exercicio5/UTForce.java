package lista03.exercicio5;

public class UTForce {
	int velocidade = 0;
	
	private String marcha = "Neutro";
	
	public void acelerarCarro() {
		velocidade = velocidade >= 130 ? 130: velocidade + 5;
		this.definirMarcha();
	}
	
	public void frearCarro() {
		velocidade = velocidade <= 130 ? 0: velocidade - 5;
		this.definirMarcha();
	}

	private void definirMarcha() {
		if(velocidade == 0) {
			marcha = "Neutro";
		}
		else if(velocidade > 0 && velocidade < 20) {
			marcha = "1";
		}
		else if(velocidade > 19 && velocidade < 40) {
			marcha = "2";
		}
		else if(velocidade > 39 && velocidade < 60) {
			marcha = "3";
		}
		else if(velocidade > 59 && velocidade < 90) {
			marcha = "4";
		}
		else {
			marcha = "5";
		}
	}
	@Override
	public String toString() {
		return "UTForce [velocidade=" + velocidade + ", marcha=" + marcha + "]";
	}

	public int getVelocidade() {
		return velocidade;
	}
}

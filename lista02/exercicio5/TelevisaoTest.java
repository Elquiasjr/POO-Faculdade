package lista02.exercicio5;

public class TelevisaoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Televisao televisao01 = new Televisao("Philips", "16.7", "1080x720p", 5, 10, false);
		televisao01.ligar();
		televisao01.alterarCanalCima();
		televisao01.exibirRelatorio();
		televisao01.aumentarVolume();
		televisao01.exibirRelatorio();
	}

}

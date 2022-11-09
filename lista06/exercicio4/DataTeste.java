package lista06.exercicio4;

public class DataTeste {

	public static void main(String[] args) {
		Data data1 = new Data("20","10", "2015");
		Data data2 = new Data("11", "2017");
		Data data3 = new Data("21");
		Data data4 = new Data();
		
		Feriado feriado1 = new Feriado();
		Feriado feriado2 = new Feriado("Hello World");
		Feriado feriado3 = new Feriado("07","09", "2023", "Dia da Farofa");
		
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(data4);
		
		System.out.println(feriado1);
		System.out.println(feriado2);
		System.out.println(feriado3);
	}

}

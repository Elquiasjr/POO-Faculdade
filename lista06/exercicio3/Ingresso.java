package lista06.exercicio3;

/*Crie uma classe chamada Ingresso que possui um valor em reais e o tipo do ingresso. Declare um
método construtor que receba o tipo do ingresso e o valor. Declare o método imprimirDadosImgresso(),
que imprime um relatório contendo o tipo do ingresso.
Crie uma classe IngressoNormal, que herda Ingresso e possui um método construtor recebendo o tipo
e o valor de ingresso. Além disso, declare um método chamado imprimirDadosIngresso(), que invoca
o método imprimirDadosIngresso() da classe pai e imprimir o preço do ingresso normal.
Crie uma classe IngressoVip, que herda Ingresso e possui um valor adicional e localização (camarote
inferior, camarote superior, por exemplo). Crie um método construtor que recebe o tipo de ingresso,
valor, valorAdicional e localização. O tipo de ingresso e o valor devem ser enviados ao construtor da
classe pai, os demais atributos devem ser atribuídos no próprio método construtor. Além disso, declare
um método privado calcularValorIngressoVip() que irá retornar o valor do ingresso VIP, este método
somará o valor do ingresso com o valor adicional. Declare um método chamado
imprimirDadosIngresso(), que invocará o método imprimirDadosIngresso() da classe pai, além disso,
imprimirá a localização e o valor do ingresso vip.
Crie as classes Camarote Superior e Camarote Inferior, ambas as classes devem herdar de
IngressoVip. Além disso, as duas classes devem possuir um método construtor que receba o tipo de 
ingresso, valor do ingresso, valor adicional e localização. Ainda no método construtor, todos os
argumentos devem ser passados ao método construtor da classe pai.
Crie uma classe de testes. Esta classe deve instanciar um objeto do tipo Ingresso Normal, passando o
tipo de ingresso e o valor por parâmetro; Camarote Inferior e Camarote Superior, passando por
parâmetro o tipo de ingresso, valor, valor adicional e localização. Para cada objeto instanciado, invoque
o método imprimirDadosIngresso() para verificar se os dados de cada objeto estão corretos.*/

public class Ingresso {
	protected double valorReais;
	protected String tipoIngresso;
	
	public Ingresso(double valorReais, String tipoIngresso) {
		super();
		this.valorReais = valorReais;
		this.tipoIngresso = tipoIngresso;
	}
	
	public void imprimirDadosIngresso() {
		System.out.println("Ingresso -\nValor: R$" + valorReais + "\nTipo do Ingresso: " + tipoIngresso);
	}
	
	
}

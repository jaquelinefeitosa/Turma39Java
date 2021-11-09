package exerciciosJava;

import java.util.Scanner;

public class programacaoSequencial8 {
//8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos
//(aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia 
//o custo de fábrica de um carro e escreva o custo ao consumidor. 

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int distribuidor, imposto, custoFabrica, custoConsumidor;

		System.out.println("\"Digite o preço do custo de veiculo: ");
		custoFabrica = leia.nextInt();

		distribuidor = custoFabrica + (custoFabrica * 28 / 100);
		imposto = custoFabrica + (custoFabrica * 45 / 100);
		custoConsumidor = custoFabrica + distribuidor + imposto;

		System.out.println("O valor final ao Consumidor será de: " + custoConsumidor);

		leia.close();
	}
}

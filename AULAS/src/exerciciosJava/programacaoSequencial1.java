package exerciciosJava;

import java.util.Scanner;

//1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias
public class programacaoSequencial1 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade, anos, meses, dias, total;

		System.out.println("Quantos anos voc� tem? ");
		anos = leia.nextInt();

		System.out.println("Quantos meses? ");
		meses = leia.nextInt();

		System.out.println("Quantos dias? ");
		dias = leia.nextInt();

		idade = (365 * anos) + (30 * meses) + dias;

		System.out.println("Total de dias �: " + idade + " dias!");

		leia.close();

	}

}

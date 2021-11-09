package exerciciosJava;

import java.util.Scanner;

public class programacaoSequencial2 {

////2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 		

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade, anos, meses, dias;

		System.out.println("Informe a idade pessoa em dias: ");
		idade = leia.nextInt();

		anos = idade / 365;
		meses = idade % 365 / 30;
		dias = idade % 365 % 30;

		System.out.println("\n Anos: " + anos);
		System.out.println("\n Meses: " + meses);
		System.out.println("\n Dias: " + dias);

		leia.close();

	}
}

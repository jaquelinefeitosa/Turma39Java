package exerciciosJava;

import java.util.Scanner;

public class programacaoSequencial4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double a, b, c, d, r, s;

		System.out.println("Digite o n�mero de A: ");
		a = leia.nextInt();
		System.out.println("Digite o n�mero de B: ");
		b = leia.nextInt();
		System.out.println("Digite o n�mero de C: ");
		c = leia.nextInt();

		r = Math.pow((a + b), 2);
		System.out.println("O valor de R �:  " + r);

		s = Math.pow((b + c), 2);
		System.out.println("O valor de S �: " + s);

		d = r + s / 2;
		System.out.println("O valor de D �: " + d);

	}

}
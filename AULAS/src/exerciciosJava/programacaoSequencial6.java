package exerciciosJava;

import java.util.Scanner;

//6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2),
//escreva a distância entre eles. A fórmula que efetua tal cálculo é:

public class programacaoSequencial6 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int a, b, c, d, r, s;

		System.out.println("Escreva o valor A: ");
		a = leia.nextInt();

		System.out.println("Escreva o valor B: ");
		b = leia.nextInt();

		System.out.println("Escreva o valor C: ");
		c = leia.nextInt();

		r = (a + b) * (a + b);
		s = (b + c) * (b + c);
		d = (r + s) / 2;

		leia.close();

	}
}

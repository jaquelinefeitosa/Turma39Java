package exerciciosJava;

import java.util.Scanner;

public class programacaoSequencial7 {

	// 7. Um sistema de equações lineares do tipo: ax+by = c / dx+ey =f
	// Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
	// valores de x e y.

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int a, b, c, d, e, f;
		int x, y;

		System.out.println("O valor de A: ");
		a = leia.nextInt();
		System.out.println("O valor de B: ");
		b = leia.nextInt();
		System.out.println("O valor de C: ");
		c = leia.nextInt();
		System.out.println("O valor de D: ");
		d = leia.nextInt();
		System.out.println("O valor de E: ");
		e = leia.nextInt();
		System.out.println("O valor de F: ");
		f = leia.nextInt();

		x = ((c * e) - (b * f) / (a * e) - (b * d));
		y = ((a * f) - (c * d) / (a * e) - (b * d));

		System.out.println("O valor de X é: " + x);
		System.out.println("O valor de X é: " + y);

		leia.close();
	}

}

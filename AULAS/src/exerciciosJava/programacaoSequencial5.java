package exerciciosJava;

import java.util.Scanner;

public class programacaoSequencial5 {

//5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. Considerar que a m�dia � ponderada e que o peso das
//notas �: 2,3 e 5, respectivamente. 	

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int nota1, nota2, nota3, media;

		System.out.println("Insira a primeira nota: ");
		nota1 = leia.nextInt();

		System.out.println("Insira a segunda nota: ");
		nota2 = leia.nextInt();

		System.out.println("Insira a terceira nota: ");
		nota3 = leia.nextInt();

		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;

		System.out.println("A m�dia do Aluno �: " + media);

		leia.close();
	}

}
package exerciciosVetoresMatrizes;

import java.util.Scanner;

public class ExerciciosVetoresMatrizes1 {

//1- Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma atividade e
// o escrever em seguida. Encontre ap�s a maior pontua��o e a apresente.	
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);	
		
		double pontos [] = new double[5];
		double maior=0.00;
		System.out.println("Verificando a maior nota\n");
		for(int x=0; x<5; x++) {
		System.out.println("Escreva a pontua��o da "+(x+1)+"� nota: ");	
		pontos[x] = leia.nextDouble();
		if(pontos[x]>maior) {
				maior=pontos[x];
			
		}	
		}
		
		System.out.println("A maior nota �: "+maior);
		
	
		
		leia.close();
		
}
	
}

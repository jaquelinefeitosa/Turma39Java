package exerciciosLacoRepeticao;

import java.util.Scanner;

public class exercicioLacoRepedicao2 {
//2-Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
	
	 public static void main(String[]args) {
     	
   	  Scanner leia = new Scanner(System.in);
   	  
			int quantidadePares, quantidadeImpares, valor; 
		
			quantidadePares = 0;
			quantidadeImpares = 0;
			
		
			for (int n = 0; n < 10; n++)
			{
				System.out.print("N�mero " + (n + 1) + ": ");
				valor = leia.nextInt();

				
					if ((valor % 2) == 0) {
						quantidadePares+= 1;
					}
						else {
						quantidadeImpares+= 1;
				}
					

			}
			
			System.out.println("Quantidade de n�meros pares: " + quantidadePares);
			System.out.println("Quantidade de n�meros �mpares: " + quantidadeImpares);
			leia.close();	
     }

	 
	 
}

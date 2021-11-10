package exerciciosLacoRepeticao;

import java.util.Scanner;

public class exercicioLacoRepeticao6 {

	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double numero, total=0, media=0, contador=0;
		
		do {
			
			System.out.println("Digite um número: ");
             numero = leia.nextDouble();
		  
             if(numero%3 == 0 && numero >0) {
			  total = total + numero;
			  contador ++;
			  System.out.println("Esse é o múltiplo de 3!");
		       }
		
	}
  while(numero != 0);
	media = total/(contador-1);
	System.out.println("Media dos inteiros positivos múltiplos de 3: %.2f"+media);
	
	}
}
package exercicioJavaLaco;

import java.util.Scanner;

public class ExercicioLaco4 {
	
//4-Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
//n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
//�mpar exiba o n�mero elevado ao quadrado.
	
	
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
       double numero, raizQuadrada, potencia;
	  
       
		System.out.println("Digite um n�mero: ");
		numero = leia.nextDouble();
		
		   raizQuadrada = Math.sqrt(numero*numero);
	       potencia = Math.pow(numero,2);
		
		if(numero<0) {
		 System.out.println("N�mero negativo!");	
		}
		else if(numero == 0) {
		 System.out.println("N�mero neutro!");	
		}
		else if((numero%2)==0) {
			System.out.println("N�mero � PAR! E sua raiz �:  " + raizQuadrada);
		}
		else if((numero%2)==1) {
			System.out.println("N�mero � �MPAR! E sua pot�ncia �:  " + potencia);
			}
		
			
		
		
	}

}


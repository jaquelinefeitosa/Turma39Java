package exercicioJavaLaco;

import java.util.Scanner;

public class ExercicioLaco2 {

//2-Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
	
	
	public static void main (String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
	int primeiro, segundo, terceiro;
	
	
	System.out.println("Digite o primeiro n�mero: ");
	primeiro = leia.nextInt();
	
	System.out.println("Digite o segundo n�mero: ");
	segundo = leia.nextInt();
	
	System.out.println("Digite o terceiro n�mero: ");
	terceiro = leia.nextInt();
	
	if((primeiro >= segundo) && (primeiro >= terceiro) && (segundo >= terceiro) ) {
		System.out.println("A ordem crescente �: " +primeiro+segundo+terceiro);
		}
	else if((primeiro >= segundo) && (primeiro >= terceiro) && (terceiro >= segundo) ) {
		System.out.println("A ordem crescente �: "+primeiro+" / " + terceiro+" / " + segundo);
		}
	else if((segundo >= primeiro) && (segundo >= terceiro) && (primeiro >= terceiro) ) {
		System.out.println("A ordem crescente �: "+segundo+" / " + primeiro+" / " + terceiro);
	    }
	else if((segundo >= primeiro) && (segundo >= terceiro) && (terceiro >= primeiro) ) {
		System.out.println("A ordem crescente �: "+segundo+" / " + terceiro+" / " + primeiro);
	    }
	else if((terceiro >= primeiro) && (terceiro >= segundo) && (primeiro >= segundo) ) {
		System.out.println("A ordem crescente �: "+terceiro+" / " + primeiro+" / " + segundo);
	    }
	else if((terceiro >= primeiro) && (terceiro >= segundo) && (segundo >= primeiro) ) {
		System.out.println("A ordem crescente �: "+terceiro+" / " + segundo+ " / "+ primeiro);
		}

	}
}
		
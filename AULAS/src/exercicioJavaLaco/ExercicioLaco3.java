package exercicioJavaLaco;

import java.util.Scanner;

public class ExercicioLaco3 {
	
//3-Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual
//categoria ela se encontra:
// 10-14 infantil
// 15-17 juvenil
// 18-25 adulto
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, infantil, juvenil, adulto;
		
		System.out.println("Digite a idade da Pessoa: ");
		idade = leia.nextInt();
		
		if((idade>= 10) && (idade <= 14)) {
			System.out.println("A Pessoa � infantil!");
			}
		
		else if((idade>= 15) && (idade <= 17)) {
			System.out.println("A Pessoa � juvenil!");
			}
		else if((idade>= 18) && (idade <= 25)) {
			System.out.println("A Pessoa � adulta!");
			}
		else {
			System.out.println("Idade inv�lida!");
		}
		
		
		
		
	}
	
	

}
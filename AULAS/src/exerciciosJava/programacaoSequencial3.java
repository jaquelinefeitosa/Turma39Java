package exerciciosJava;

import java.util.Scanner;

public class programacaoSequencial3 {
////3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos e mostre-o expresso em horas, 
//minutos e segundos. 
	
	
		
		public static void main(String[] args) {
			
		Scanner leia = new Scanner(System.in);
		
		int tempoEmSegundos;
		int horas;
		int minutos;
		int segundos;
		
		System.out.println("Informe o tempo na fabrica em segundos: ");
		tempoEmSegundos = leia.nextInt();
		
		horas = tempoEmSegundos / 3600;
		minutos = (tempoEmSegundos % 3600) / 60;
		segundos = (tempoEmSegundos % 3600) % 60;
		
		System.out.println("O tempo de dura��o da f�brica � de " +horas+" em horas e em minutos de "+minutos+ " e em segundos de "+segundos);
		
		}
			
		
	}

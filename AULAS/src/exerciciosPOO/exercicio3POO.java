package exerciciosPOO;

public class exercicio3POO {

public static void main (String [] args) {}	

//3-Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto produto eletrônico, defina 
//as instancias deste objeto e apresente as informações deste objeto no console.


			public String marca;
			public boolean ligado = false;

			public void eletronicoAtivado() {
			System.out.println("O aparelho eletronico da " + marca + " está ligado");
			ligado = true;
}

			public void eletronicoDesativado() {
			System.out.println("O aparelho eletronico da " + marca + " está desligado");
			ligado = false;
}


}

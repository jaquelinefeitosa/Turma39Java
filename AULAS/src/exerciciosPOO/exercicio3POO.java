package exerciciosPOO;

public class exercicio3POO {

public static void main (String [] args) {}	

//3-Crie uma classe produto eletr�nico e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto produto eletr�nico, defina 
//as instancias deste objeto e apresente as informa��es deste objeto no console.


			public String marca;
			public boolean ligado = false;

			public void eletronicoAtivado() {
			System.out.println("O aparelho eletronico da " + marca + " est� ligado");
			ligado = true;
}

			public void eletronicoDesativado() {
			System.out.println("O aparelho eletronico da " + marca + " est� desligado");
			ligado = false;
}


}

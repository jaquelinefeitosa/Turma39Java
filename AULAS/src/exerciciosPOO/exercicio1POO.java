package exerciciosPOO;

public class exercicio1POO {

	public static void main (String [] args) {}
		
//1-Crie uma classe cliente e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto cliente, defina as instancias deste objeto
//e apresente as informa��es deste objeto no console.		
		
				//Atributos
				public String nome;
				public int idade;
				public String cpf;
				
				public boolean negativado = false;
				
				//Lista o cliente
				public void listaCliente(){
					System.out.println(nome);
				}
				//Lista o cliente negativado
				public void listarClienteNegativado(){
					negativado = true;
				}
				//Lista o cliente positivo
				public void listarClientePositivo(){
					negativado = false;	
				
		
				}
	
	
	
	
	
	
}

package exerciciosPOO;

public class exercicio4POO {

private static final String Nome = null;
private static final String Almo�o = null;


public static void main (String [] args) {}

//4-Crie uma classe funcion�rio e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto funcion�rio, defina as instancias 
//deste objeto e apresente as informa��es deste objeto no console.


//Criando o objeto do Funcionario

	private String Funcionario, Entrada, Saida;
	private int Registro;
	private int numRegistro;
		
	
	void nomeFuncionario() {
		System.out.println("Nome do Funcionario:  ");	
	}
		
	void entradaFuncionario() {
				System.out.println("Entrada:  ");	
	}

	void almocoFuncionario() {
			System.out.println("Hor�rio de Almo�o:  ");	
	}

	void saidaFuncionario() {
			System.out.println("Sa�da:  ");	
	}
	
	
		
	public String getNomeFuncionario() {
		return Nome;
	}

	public String getEntrada() {
		return Entrada;
	}

	public String getAlmo�o() {
		return Almo�o;
	}
	
	public String getSaida() {
		return Saida;
	}


	public void setNumRegistro(int numRegistro) {
		this.numRegistro = numRegistro;
		}
	
	
	
}
package exerciciosPOO;

public class exercicio4POO {

private static final String Nome = null;
private static final String Almoço = null;


public static void main (String [] args) {}

//4-Crie uma classe funcionário e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto funcionário, defina as instancias 
//deste objeto e apresente as informações deste objeto no console.


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
			System.out.println("Horário de Almoço:  ");	
	}

	void saidaFuncionario() {
			System.out.println("Saída:  ");	
	}
	
	
		
	public String getNomeFuncionario() {
		return Nome;
	}

	public String getEntrada() {
		return Entrada;
	}

	public String getAlmoço() {
		return Almoço;
	}
	
	public String getSaida() {
		return Saida;
	}


	public void setNumRegistro(int numRegistro) {
		this.numRegistro = numRegistro;
		}
	
	
	
}
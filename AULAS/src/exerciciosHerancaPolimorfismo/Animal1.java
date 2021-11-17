package exerciciosHerancaPolimorfismo;

public class Animal1 {

//1-Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos (observe a tabela), utilize os seus conhecimentos e 
//distribua as características de forma que tudo o que for comum a todos os animais fique na classe Animal: 	
	
	private String nome, som;
	private int idade;
	private boolean correr = false;
	
		

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public boolean isCorrer() {
		return correr;
	}
	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
		
	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	
	public void emiteSom() {
		System.out.println("Emitindo som...");
	}	
		
	
	
}

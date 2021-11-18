package exerciciosHerancaPolimorfismo;

public class Preguica extends Animal1 {
	private String arvore;

	public String getArvore() {
		return arvore;
	}

	public void setArvore(String arvore) {
		this.arvore = arvore;
	}

	@Override
	public String toString() {
		return "Preguica [arvore=" + arvore + ", getArvore()=" + getArvore() + ", getNome()=" + getNome()
				+ ", getIdade()=" + getIdade() + ", isCorrer()=" + isCorrer() + ", getSom()=" + getSom()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}

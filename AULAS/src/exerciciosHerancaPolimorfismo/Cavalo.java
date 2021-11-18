package exerciciosHerancaPolimorfismo;

public class Cavalo extends Animal1 {
	private String corrida;

public String getCorrida() {
	return corrida;
}

public void setCorrida(String corrida) {
	this.corrida = corrida;
}

@Override
public String toString() {
	return "Cavalo [corrida=" + corrida + ", getCorrida()=" + getCorrida() + ", getNome()=" + getNome()
			+ ", getIdade()=" + getIdade() + ", isCorrer()=" + isCorrer() + ", getSom()=" + getSom() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

	
	
	
}

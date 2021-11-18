package Polimorfismo;

public class estoqueLoja {

//3-Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá trabalhar com Collection do tipo List do Java 
//para manipular os dados desse estoque, o programa deverá atender as seguintes funcionalidades:

//Armazenar dados da List
//Remover dados da list;
//Atualizar dados da list.
//Apresentar todos os dados da list.
	
private String produtos;
private int quantidade, validade;
public estoqueLoja(String produtos, int quantidade, int validade) {
	super();
	this.produtos = produtos;
	this.quantidade = quantidade;
	this.validade = validade;
}


public String getProdutos() {
	return produtos;
}
public void setProdutos(String produtos) {
	this.produtos = produtos;
}
public int getQuantidade() {
	return quantidade;
}
public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}
public int getValidade() {
	return validade;
}
public void setValidade(int validade) {
	this.validade = validade;
}


	
	
	

	
	
	
	
	
	
	
	
}

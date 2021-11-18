package Polimorfismo;

public class LojaJack extends estoqueLoja implements Iestoqueloja {

	private String roupas;

	public LojaJack(String produtos, int quantidade, int validade, String roupas) {
		super(produtos, quantidade, validade);
		this.roupas = roupas;
	}

	public String getRoupas() {
		return roupas;
	}

	public void setRoupas(String roupas) {
		this.roupas = roupas;
	}

	@Override
	public void contagem() {
		// TODO Auto-generated method stub
		System.out.println("Quantidade de estoque: ");
	}

	@Override
	public void venda() {
		// TODO Auto-generated method stub
		System.out.println("Quantidade de vendas: ");
	}

	
	
	
	
	
	
	
	
	
	
	
	
}

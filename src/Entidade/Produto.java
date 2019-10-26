package Entidade;

public class Produto {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	public Produto() {
		
	}
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public double totalValorEstoque() {
		return this.preco * quantidade;
	}
	
	public void adcionaProoduto(int x) {
		this.quantidade += quantidade;
	}
	
	public int getTotalPtoduto() {
		return this.quantidade += quantidade;
	}
	
	public void retiraProduto(int y) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome + ", "
				+ "preço: " 
				
				+ String.format("%.2f", preco)
				+ "Qtd: "
				+ String.format("%.2f%n", totalValorEstoque() );
	}

}

package br.com.ecommerce.beans;

public class Vendas {
	private int notaFiscal;
	private String data;
	private float total;
	private Produto produto;
	private Cliente cliente;
	
	
	public String getAll() {
		return
				"Cliente........:" + cliente.getAll() + "\n" ;
				//"Endereco........:" + endereco.getAll() + "\n";
	}
	
	public void setAll(int notaFiscal, String data, float total, Produto produto, Cliente cliente) {
		this.notaFiscal = notaFiscal;
		this.data = data;
		this.total = total;
		this.produto = produto;
		this.cliente = cliente;
				
	}
	
	public int getNotaFiscal() {
		return notaFiscal;
	}
	public void setNotaFiscal(int notafiscal) {
		this.notaFiscal = notafiscal;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
}

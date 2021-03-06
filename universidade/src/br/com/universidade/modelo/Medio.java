package br.com.universidade.modelo;

import br.com.universidade.padroes.PadraoFormacao;

public class Medio extends Formacao implements PadraoFormacao {
	private int tipo;
	
	
	public void setAll(float valor, String descricao, int duracao, int tipo) {
		super.setAll(valor, descricao, duracao);
		this.tipo = tipo;
	}
	
	public String getAll() {
		return
				super.getAll() + "\n" +
				"Tipo....: " + tipo + "\n";
	}
	public Medio() {
		super();
	}

	public Medio(float valor, String descricao, int duracao, int tipo) {
		super(valor, descricao, duracao);
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	@Override
	public double calcularMensalidade(float fator) {
		// TODO Auto-generated method stub
		return getvalor() / 36 * fator;
	}
	@Override
	public void definirDuracao() {
		// TODO Auto-generated method stub
		setDuracao(36);
	}
	
	
	
}

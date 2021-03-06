package br.com.universidade.modelo;

import br.com.universidade.padroes.PadraoFormacao;

public class Bacharelado extends Formacao implements PadraoFormacao{
	private String projetoConclusao;
	private int cargaHorariaEstagio;
	
	public void setAll(float valor, String descricao, int duracao, String projetoConclusao, int cargaHorariaEstagio) {
		super.setAll(valor, descricao, duracao);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	
	public String getAll() {
		return
				super.getAll() +
				"Projeto de Conclusao: " + projetoConclusao + "\n" +
				"Carga Horaria do Estagio: " + cargaHorariaEstagio + "\n";
	}
	
	public Bacharelado() {
		super();
	}
	public Bacharelado(float valor, String descricao, int duracao, String projetoConclusao, int cargaHorariaEstagio) {
		super(valor, descricao, duracao);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	public String getProjetoConclusao() {
		return projetoConclusao;
	}
	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}
	public int getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}
	public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}

	@Override
	public double calcularMensalidade(float fator) {
		// TODO Auto-generated method stub
		return getvalor() / 48 * fator;
	}

	@Override
	public void definirDuracao() {
		// TODO Auto-generated method stub
		setDuracao(48);
	}
	
	
	
}

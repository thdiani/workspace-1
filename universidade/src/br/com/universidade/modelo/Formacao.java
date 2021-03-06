package br.com.universidade.modelo;

import br.com.universidade.padroes.PadraoFormacao;

// implements serve para for�ar o uso da interface com os nomes de metodos
// abstract usado para impedir que vc instancie a super class permitindo somento as classes filho

public abstract class Formacao implements PadraoFormacao{

		private float valor;
		private String descricao;
		private int duracao;
		
		public void setAll(float valor, String descricao, int duracao) {
			this.valor = valor;
			this.descricao = descricao;
			this.duracao = duracao;
		}
		
		public String getAll() {
			return
					"valor....: " + valor + "\n" +
					"Descricao: " + descricao + "\n" +
					"Duracao..: " + duracao + "\n";
			
		}
		
		public Formacao() {
			super();
		}
		
		public Formacao(float valor, String descricao, int duracao) {
			super();
			this.valor = valor;
			this.descricao = descricao;
			this.duracao = duracao;
		}
		
		public float getvalor() {
			return valor;
		}
		public void setvalor(float valor) {
			this.valor = valor;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public int getDuracao() {
			return duracao;
		}
		public void setDuracao(int duracao) {
			this.duracao = duracao;
		}

		@Override
		public double calcularMensalidade(float fator) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void definirDuracao() {
			// TODO Auto-generated method stub
			
		}
		
		
		
}

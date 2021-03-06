package br.com.lojauati.modelo;

public class Elevador {
	private int qtdePessoas;
	private int capacidadePessoas;
	private int andarAtual;
	private int maiorAndar;
	private int menorAndar;
	
	public Elevador() {}
	
	//construtor
	public Elevador(int cp, int ma) {
		capacidadePessoas = cp;
		maiorAndar = ma;
	}
	
	// <modificador> <tipo do retorno> (<tipo do paramentro>) {...}

	public String exibirTudo () {
		return 
				"Capacidade Maxima.....: " + capacidadePessoas + "\n" +
				"Qtde de pessoas Atual.: " + qtdePessoas + "\n" +
				"Andar Atual...........: " + andarAtual + "\n" +
				"Maior Andar...........: " + maiorAndar + "\n" +
				"Menor Andar...........: " + menorAndar + "\n";
	}
	
	public void sair (int qtde) {
		if (qtde <= qtdePessoas) {
			qtdePessoas -= qtde;
		}
		
	}
	
	public void entrar (int qtde) {
		int total = qtdePessoas+qtde;
		if (total <=capacidadePessoas ) {
			qtdePessoas += qtde;
		}
	}
	
	public void descer () {
		if (andarAtual > menorAndar) {
		andarAtual -= 1;
		}
	}
	
	public void subir () {
		if (andarAtual < maiorAndar) {
		andarAtual ++;
		}
	}
	
	public void preencherCapacidadePessoas (int pessoas) {
		if(pessoas > 0) {
			capacidadePessoas = pessoas;
		}
		
	}
	
	public void preencherMenorAndar (int pAndar) {
		if (pAndar < maiorAndar) {
			menorAndar=pAndar;
		}
	}
	
	
	public void preencherMaiorAndarint (int pAndar) {
		if(pAndar > menorAndar) {
			maiorAndar = pAndar;
		}
				
	}
}

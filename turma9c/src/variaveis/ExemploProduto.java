package variaveis;

import javax.swing.JOptionPane;

public class ExemploProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String produto = "";
		int qtde = 0;
		double valor = 0;
		double desc = 90;
		double total = 0;
		double total_desc = 0;
		
		produto = JOptionPane.showInputDialog("Digite o nome do Produto:");
		qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade:"));
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor:"));
		
		total = valor * qtde;
		total_desc = ((valor / qtde ) * desc );
		System.out.println("Produto + Total: " + produto.toUpperCase() + " " + total) ;
		System.out.println("\nTotal com desconte de 10%: " + total_desc) ;

	}
}
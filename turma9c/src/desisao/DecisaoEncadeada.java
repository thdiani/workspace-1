package desisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {

		String nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno: ").toUpperCase();
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Digite a quantidade de faltas: "));

		if (faltas > 20) {
			System.out.println("Reprovado por falta !, quantidade de faltas " + faltas);
		}
		else {
			float notaAluno1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1: "));
			float notaAluno2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2: "));


			float media = (notaAluno1 + notaAluno2)/2;
			System.out.println("Aluno: " + nomeAluno + ", sua media foi " + media + ".");

			if ( media >= 6 ) {
				System.out.println("Parabens: " + nomeAluno + ", Voce esta aprovado !");
			} 
			else if ( media < 4) {
				System.out.println("Laskou: " + nomeAluno + ", Voce esta reprovado !");
			} 
			else { //if ( media < 6 && media >=  4) {
				System.out.println("Ainda tem chance: " + nomeAluno + ", sua nota foi " + media);
			}
		}
	}
}

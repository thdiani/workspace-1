package variaveis;

import javax.swing.JOptionPane;

public class ManipulacaoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = JOptionPane.showInputDialog("Email");
		System.out.println("Original: " + email);
		System.out.println("Minuscula: " + email.toLowerCase());
		System.out.println("Maiuscula: " + email.toUpperCase());
		System.out.println("Posi��o do @: " + email.indexOf("@"));
		System.out.println("Existe @: " + email.contains("@"));
		System.out.println("Qtde caracteres : " + email.length());
		System.out.println("Parte da string 3 ao 6 iniciando no 0: " + email.substring(3,6));
		System.out.println("Exclui o primeiro caracter : " + email.substring(1));
		System.out.println("Usuario: " + email.substring(0,email.indexOf("@")));
		System.out.println("Servidor + o @: " + email.substring(email.indexOf("@")+1));
		
		System.out.println("Servidor sem o @: " + email.substring(email.indexOf("@")+1,email.indexOf(".com")));
		
		System.out.println("Primeira metade: " + email.substring(0,email.length()/2)); // nesse caso s� funciona se for par a quantidade de caracter
		
		System.out.println("Compara��o case sensitive: " + email.equals("vncrdo@gmail.com"));
		
		System.out.println("Compara��o case sensitive: " + email.equalsIgnoreCase("vncrdo@gmail.com"));
		
	}
}

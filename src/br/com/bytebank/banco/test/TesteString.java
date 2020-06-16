package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {
		
		String vazio = " ";
		String nome = "Alura";
	
		char d = 'A';
		char c = 'a';
		
		String outra = nome.replace(c, d);
		String minuscula = nome.toLowerCase();
		String maiuscula = nome.toUpperCase();
		
		
		System.out.println(nome);
		System.out.println(outra);
		System.out.println(minuscula);
		System.out.println(maiuscula);
		
		int pos = nome.indexOf("ur");
		char ca = nome.charAt(0);
		System.out.println(ca);
		System.out.println(pos);
		
		String sub = nome.substring(1);
		System.out.println(sub);
		
		System.out.println(nome.length());
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		String outrovazio = vazio.trim();
		System.out.println(outrovazio.isEmpty());
		
		StringBuilder builder = new StringBuilder("Socorram");
		builder.append("-");
		builder.append("me");
		builder.append(", ");
		builder.append("subi ");
		builder.append("no ");
		builder.append("ônibus ");
		builder.append("em ");
		builder.append("Marrocos");
		String texto = builder.toString();
		System.out.println(texto);
		
		
		

	}

}

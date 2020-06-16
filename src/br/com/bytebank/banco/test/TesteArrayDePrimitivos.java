package br.com.bytebank.banco.test;

public class TesteArrayDePrimitivos {

	//Array []
	public static void main(String[] args) {
		
		int[] idades = new int[5]; //inicializa o array com os valores padrão
		
//		idades[0] = 29;
//		idades[1] = 39;
//		idades[2] = 19;
//		idades[3] = 69;
//		idades[4] = 59;
//		
//		int idade1 = idades[0];
//		int idade2 = idades[1];
//		int idade3 = idades[2];
//		int idade4 = idades[3];
//		int idade5 = idades[4];
		
		for (int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		
//		System.out.println(idade1);
//		
//		System.out.println(idades.length);
		

	}

}

package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		
		/** 
		 * Primitive code, legacy
		 */
		int [] idades = new int[5];
		String[] nomes = new String[5];
		
		int idade = 29; //Integer
		
		/** 
		 * wrappers code
		 */
		//Integer idadeRef = new Integer(29); //Legacy code - deprecated
		Integer idadeRef = Integer.valueOf(29);
		int valor = idadeRef.intValue(); // unboxing method
		
		System.out.println(idadeRef.doubleValue());
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		
		String s = args[0]; //
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		
		
		List<Integer> numeros = new ArrayList<Integer>(); // new code
		numeros.add(29); //Autoboxing method
		
		

	}

}

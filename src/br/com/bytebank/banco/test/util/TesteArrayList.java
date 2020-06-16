package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;



public class TesteArrayList {

	public static void main(String[] args) {
		
		ArrayList<Conta>lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 3311);		
		lista.add(cc);
		Conta cc2 = new ContaCorrente(22, 3300);
		lista.add(cc2);
		
		
		System.out.println("Tamanho..: " + lista.size());
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("Tamanho..: " + lista.size());
		
		
		Conta cc4 = new ContaCorrente(22, 11);		
		lista.add(cc);
		Conta cc5 = new ContaCorrente(22, 30);
		lista.add(cc2);
		
		/**
		 *  Iteraçao com o objeti, metotodo tradicional
		 */
		for (int i = 0; i < lista.size(); i++) {			
			Conta conta = lista.get(i);
			System.out.println(conta);
			
		}
		
		/**
		 * Iteraçao com novo forma de escrito do for
		 */
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		
	}

}

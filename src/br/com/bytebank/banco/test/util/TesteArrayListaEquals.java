package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;



public class TesteArrayListaEquals {

	public static void main(String[] args) {
		
		/*
		 * List<Conta>lista = new Vector<Conta>();
		 * List<Conta>lista = new LinkedList<Conta>();
		 */
		
		List<Conta>lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 3311);		
		lista.add(cc);
		
		
		Conta cc2 = new ContaCorrente(22, 3300);
		lista.add(cc2);
		
		
		Conta cc3 = new ContaCorrente(22, 3300);
		boolean existe = lista.contains(cc3);
		
		System.out.println("Já existe ? "+ existe);
		
			
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		
	}

}

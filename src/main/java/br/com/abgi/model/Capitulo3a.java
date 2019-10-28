package br.com.abgi.model;

import java.util.Arrays;
import java.util.List;

public class Capitulo3a {

	public static void main(String[] args) {
		Validator<String> validadorCEP = new Validator<String>(){

			@Override
			public boolean valida(String valor) {
				return valor.matches("[0-9]{5}-[0-9]{3}");
			}
			
		};
		
		List<String> ceps = Arrays.asList("09791-456","0986756545");
		
		ceps.forEach(s -> System.out.println(validadorCEP.valida(s)));
	}
}

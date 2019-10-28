package br.com.abgi.model;

import java.util.Arrays;
import java.util.List;

public class Capitulo3b {

	public static void main(String[] args) {
	
		List<String> ceps = Arrays.asList("09791-456","0986756545");
		
		ceps.forEach(valor -> System.out.println(valor.matches("[0-9]{5}-[0-9]{3}")));
	}
	
}

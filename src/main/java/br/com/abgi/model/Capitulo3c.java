package br.com.abgi.model;

public class Capitulo3c {

	public static void main(String[] args) {
	
		final int numero = 5;
		
		new Thread(()->{
			System.out.println(numero);
		}).start();

	}
	
}

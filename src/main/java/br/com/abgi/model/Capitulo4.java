package br.com.abgi.model;

public class Capitulo4 {

	public static void main(String[] args) {
		
		new Thread(()-> {
			for (int i = 0; i < 1000; i++) {
				System.out.println(i);
			}
		}).start();
	}
}

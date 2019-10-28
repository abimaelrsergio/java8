package br.com.abgi.model;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Capitulo2c {

	public static void main(String[] args) {
		Usuario usuario1 = new Usuario("Abimael",150);
		Usuario usuario2 = new Usuario("Rodrigues",120);
		Usuario usuario3 = new Usuario("Sergio",10);
		
		List<Usuario> usuarios = Arrays.asList(usuario1, usuario2, usuario3);
		
		Consumer<Usuario> mostrador = new Consumer<Usuario>() {

			public void accept(Usuario u) {
				System.out.println(u.getNome());
			}
			
		};
		
		usuarios.forEach(mostrador);

	}
}

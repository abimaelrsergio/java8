package br.com.abgi.model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Capitulo4b {

	public static void main(String[] args) {
		
		Usuario user1 = new Usuario("Abima",150);
		Usuario user2 = new Usuario("Rodrigues",170);
		Usuario user3 = new Usuario("Sergio",150);
		
		Predicate<Usuario> predicado = new Predicate<Usuario>() {

			@Override
			public boolean test(Usuario u) {
				return u.getPontos() > 160;
			}
			
		};
		
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);
		
		usuarios.removeIf(predicado);
		
		usuarios.forEach(u -> System.out.println(u.getNome()));
	}
}

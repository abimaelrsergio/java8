package br.com.abgi.model;

import java.util.ArrayList;
import java.util.List;

public class Capitulo4c {

	public static void main(String[] args) {
		
		Usuario user1 = new Usuario("Abima",150);
		Usuario user2 = new Usuario("Rodrigues",170);
		Usuario user3 = new Usuario("Sergio",150);
		
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);
		
		usuarios.removeIf(u -> u.getPontos() > 160);
		
		usuarios.forEach(u -> System.out.println(u.getNome()));
	}
}

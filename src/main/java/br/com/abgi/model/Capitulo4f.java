package br.com.abgi.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Capitulo4f {

	public static void main(String[] args) {

		Usuario user1 = new Usuario("Abima", 150);
		Usuario user2 = new Usuario("Saul", 170);
		Usuario user3 = new Usuario("Maria", 150);
		Usuario user4 = new Usuario("Pedro", 150);
		Usuario user5 = new Usuario("José", 150);
		Usuario user6 = new Usuario("Cicero", 150);
		Usuario user7 = new Usuario("Vilmar", 150);
		Usuario user8 = new Usuario("Wilvin", 150);
		Usuario user9 = new Usuario("Wilson", 150);
		Usuario user10 = new Usuario("Gigi", 150);

		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);
		usuarios.add(user4);
		usuarios.add(user5);
		usuarios.add(user6);
		usuarios.add(user7);
		usuarios.add(user8);
		usuarios.add(user9);
		usuarios.add(user10);

		Collections.sort(usuarios, (u1, u2) -> u1.getNome().compareTo(u2.getNome()));

		usuarios.forEach(u -> System.out.println(u.getNome()));
	}
}

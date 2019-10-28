package br.com.abgi.model;

import java.util.Arrays;
import java.util.List;

public class Capitulo2a {

	public static void main(String[] args) {
		Usuario usuario1 = new Usuario("Abimael",150);
		Usuario usuario2 = new Usuario("Rodrigues",120);
		Usuario usuario3 = new Usuario("Sergio",10);
		
		List<Usuario> usuarios = Arrays.asList(usuario1, usuario2, usuario3);
				
		Mostrador mostrador = new Mostrador();
		usuarios.forEach(mostrador);
	}
}

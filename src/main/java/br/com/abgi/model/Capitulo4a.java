package br.com.abgi.model;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Capitulo4a {

	public static void main(String[] args) {
		Usuario user1 = new Usuario("Abima",150);
		Usuario user2 = new Usuario("Rodrigues",150);
		Usuario user3 = new Usuario("Sergio",150);
		
		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		
		Consumer<Usuario> mostraMensagem = u -> System.out.println("antes de imprimir os nomes") ;
		
		Consumer<Usuario> imprimeNome = u -> System.out.println(u.getNome());
		
		usuarios.forEach(mostraMensagem.andThen(imprimeNome));
	}
}

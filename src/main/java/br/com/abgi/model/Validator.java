package br.com.abgi.model;

@FunctionalInterface
public interface Validator<T> {

	boolean valida(T t);

}

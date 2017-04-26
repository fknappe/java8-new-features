package br.com.github.java8.lambda;

public class UseSimpleInterface {

	public static void main(String[] args) {

		SimpleInterface simpleInterface = () -> System.out.println("Java 8 is awesome!");
		simpleInterface.test();
	}
}

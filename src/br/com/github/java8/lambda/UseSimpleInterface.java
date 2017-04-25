package br.com.github.java8.lambda;

public class UseSimpleInterface {

	public static void main(String[] args) {

		// An instance of a functional interface using a java8 expression
		SimpleInterface tester = () -> System.out.println("Java SE 8 is awesome!");
		tester.test();
	}
}

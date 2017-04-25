package br.com.github.java8.lambda;


public class UseInterfaceWithArgs {

    public static void main(String[] args) {
        InterfaceWithArgs obj = (v1, v2) -> {
            int result = v1 * v2;
            System.out.println(String.format("The result is: %d", result));
        };

        obj.test(5, 10);
    }
}

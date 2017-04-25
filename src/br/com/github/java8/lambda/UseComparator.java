package br.com.github.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UseComparator {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList(
            "AAA", "bbb", "CCC", "dddd", "EEEE"
        );

        Collections.sort(strings);
        System.out.println(String.format("Case sensitive sort: %s", strings));

        /*Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return str1.compareToIgnoreCase(str2);
            }
        });*/

        /*Collections.sort(strings, (str1, str2) -> str1.compareToIgnoreCase(str2));*/

        Collections.sort(strings, String::compareToIgnoreCase);
        System.out.println(String.format("Case insensitive sort: %s", strings));
    }
}

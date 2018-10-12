package good;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GoodApp {

    public static void main(String[] args) {

        List<String> myStrings = Arrays.asList("hello", "this", "is", "sample", "data");
        Stream<String> stringStream = myStrings
                .stream()
                .map((word) -> word + "! ");

        List<String> newStrings = new ArrayList<>(Arrays
                .asList(stringStream.toArray(String[]::new)));
        newStrings.forEach(System.out::print);

        String[] myNumbersAndLetters = {"10", "A", "2", "3B", "40", "50", "500", "abc"};
        Arrays.stream(myNumbersAndLetters)
                .filter(abc -> abc.length() <= 2)
                .filter(num -> {
                    try {
                        Integer.parseInt(num);
                        return true;
                    } catch (NumberFormatException e) {
                        return false;
                    }
                }).map(Integer::parseInt)
                .map(num -> num * 10)
                .reduce((current, total) -> total = current > total ? current : total)
                .ifPresent(System.out::print);

    }
}

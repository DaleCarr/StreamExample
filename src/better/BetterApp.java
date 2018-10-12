package better;

import java.util.Arrays;
import java.util.List;

public class BetterApp {

    public static void main(String[] args) {
        List<String> myStrings = Arrays.asList("hello","this","is","sample","data");
       StringModifications.betterPrint(StringModifications.betterMethod(myStrings));
    }
}

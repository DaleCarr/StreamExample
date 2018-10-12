package bad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class BadApp {
    public static ArrayList<String> badMethod(List<String> myStrings){
        ArrayList<String> newStrings = new ArrayList<>();
        for (int i = 0; i < myStrings.size(); i++) {
            newStrings.add(myStrings.get(i)+ "! ");
        }
        return newStrings;
    }
    public static void badPrint(ArrayList<String> toPrint){
        for (int i = 0; i < toPrint.size(); i++) {
            System.out.print(toPrint.get(i));
        }
    }
    public static void main(String[] args) {
        List<String> myStrings = Arrays.asList("hello","this","is","sample","data");
        badPrint(badMethod(myStrings));
    }
}

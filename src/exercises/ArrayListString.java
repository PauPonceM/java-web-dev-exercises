package exercises;

import java.util.ArrayList;

public class ArrayListString {
    public static void main(String[] args){
        ArrayList<String> word= new ArrayList<>();
        word.add("a");
        word.add("b");
        word.add("c");
        word.add("d");
        word.add("e");

        for(String word1: word) {
            System.out.println(word1);
        }

    }
}

package exercises;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args){
        String phrase= "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words= phrase.split("\\.");
        System.out.println(Arrays.toString(words));
    }
}

package studio2;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class CountingNumbers {
    public static void main(String[] args) {
        //String phrase = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
       File file= new File("src/studio2/random_text.txt");
       String phrase="";
       try{
           Scanner file_input = new Scanner(file);
           while(file_input.hasNextLine()){
               String line= file_input.nextLine();
               phrase+=line;
           }
           file_input.close();
       }
       catch (Exception e){
           e.printStackTrace();
       }
        //Scanner input = new Scanner(System.in);
        //System.out.println("Input a text: ");
        //String phrase= input.nextLine();
        //input.close();

        char[] charactersInString = phrase.toLowerCase().toCharArray();


        HashMap<Character, Integer> characterToCount = new HashMap<>();
        for (char c : charactersInString) {
            if (Character.isAlphabetic(c)) {
                if (characterToCount.containsKey(c)) {
                    Integer totalCount = characterToCount.get(c);
                    totalCount++;

                    characterToCount.put(c, totalCount);
                } else {
                    characterToCount.put(c, 1);
                }
            }
        }
        System.out.println(characterToCount);
    }
    }


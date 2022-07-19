package exercises;
import java.util.Scanner;
public class Alice {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister " +
                "on the bank, and of having nothing to do: once or twice she had peeped into " +
                "the book her sister was reading, but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("Please type a term to begin search: ");
        String term= input.nextLine();

        Boolean found= firstSentence.toLowerCase().contains(term.toLowerCase());
        System.out.println(found);

        Integer index= firstSentence.indexOf(term);
        Integer length= term.length();
        System.out.println("Your search term first appears at index " + index);

        String modifiedSentence= firstSentence.replace(term,"");
        System.out.println(modifiedSentence);
    }
}

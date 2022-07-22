package exercises;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<>();

        for(int i=1; i < 11; i++){
            numbers.add(i);
        }
        System.out.println(numbers);
        System.out.println(sumEven(numbers));
    }
    public static int sumEven(ArrayList<Integer> numbers){
        int total =0;
        for(int integer : numbers){
            if(integer % 2==0) {
                total += integer;
            }
        }
        return total;
    }
}

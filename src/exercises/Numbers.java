package exercises;

import jdk.swing.interop.SwingInterOpUtils;

public class Numbers {
    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        for (int odd : integerArray) {
            if (odd % 2 == 1) {
                System.out.println(odd);
            }
        }
    }
}


import java.util.ArrayList;

public class DifferenceArraysArrayLists {

    public static void main(String[] args) {

        // Array example
        int[] numbersArray = {1, 2, 3};

        System.out.println("Array values:");
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.println(numbersArray[i]);
        }

        // ArrayList example
        ArrayList<Integer> numbersList = new ArrayList<>();

        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);

        // ArrayList can grow dynamically
        numbersList.add(4);

        // Remove an element
        numbersList.remove(1);

        System.out.println("\nArrayList values:");
        for (int number : numbersList) {
            System.out.println(number);
        }

        // Difference demonstration
        System.out.println("\nArray length: " + numbersArray.length);
        System.out.println("ArrayList size: " + numbersList.size());
    }
}
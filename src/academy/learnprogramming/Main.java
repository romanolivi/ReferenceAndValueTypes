package academy.learnprogramming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int myValue = 10;
	    int anotherValue = myValue;

	    System.out.println("myValue = " + myValue);
        System.out.println("anotherValue = " + anotherValue);

        anotherValue++;

        System.out.println("myValue = " + myValue);
        System.out.println("anotherValue = " + anotherValue);

        // myIntArray & anotherArray both point to the same array. both variables are 'references' of the same array.
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));

        // Changing anotherArray's reference.
        anotherArray = new int[] {4, 5, 6, 7, 8};
        modifyArray(myIntArray);

        System.out.println("after modify myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after modify anotherArray = " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        // changing array's reference. this will not change the array's that are passed in as arguments.
        array = new int[] {1, 2, 3, 4, 5};
    }
}


























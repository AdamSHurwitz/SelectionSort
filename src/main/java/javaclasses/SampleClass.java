package javaclasses;

/**
 * Created by adamhurwitz on 2/27/16.
 */
public class SampleClass {
    static private final String LOG_TAG = SampleClass.class.getSimpleName();

    static int[] array = {22, -1, 99, 88, 0, 7, 42};
    //static int minValueIndex;
    int minValue;

    public static void main(String[] arg) {
        sortArrayMethod(array);

        System.out.print("\nAnswer is: ");
        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x] + " | ");
        }
    }

    public static int[] sortArrayMethod(int[] array) {
        int[] sortedArray = array;

        System.out.print("sortedArray - ");
        for (int x = 0; x < sortedArray.length; x++) {
            System.out.print(sortedArray[x] + " | ");
        }
        System.out.println("");

        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println("i - " + i + " swap(" + i + ","
                    + " findIndexofMinimum of " + findIndexOfMinimum(i) + ")");
            swap(i, findIndexOfMinimum(i));
        }
        return sortedArray;
    }

    public static int findIndexOfMinimum(int indexToStart) {
        int minValIndex = indexToStart;
        int minVal = array[indexToStart];
        for (int j = minValIndex; j < array.length; j++) {
            if (array[j] < minVal) {
                minValIndex = j;
                minVal = array[j];
            }
        }
        return minValIndex;
    }

    public static void swap(int swapOneIndex, int swapTwoIndex) {
        int temp = array[swapOneIndex];
        array[swapOneIndex] = array[swapTwoIndex];
        array[swapTwoIndex] = temp;

        System.out.print("sortedArray - ");
        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x] + " | ");
        }
        System.out.println("");

    }
}

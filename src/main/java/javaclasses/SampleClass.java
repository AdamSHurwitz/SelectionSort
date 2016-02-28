package javaclasses;

/**
 * Created by adamhurwitz on 2/27/16.
 */
public class SampleClass {
    static private final String LOG_TAG = SampleClass.class.getSimpleName();

    static int[] array = {22, 11, 99, 88, 9, 7, 42};
    //static int minValueIndex;
    int minValue;

    public static void main(String[] arg) {
        sortArrayMethod(array);

        System.out.println("\nAnswer is: ");
        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x] + " | ");
        }

    }

    public static int[] sortArrayMethod(int[] array) {
        int[] sortedArray = array;
        //System.out.println("sortedArray.length - " + sortedArray.length);

        System.out.print("sortedArray - ");
        for (int x = 0; x < sortedArray.length; x++) {
            System.out.print(sortedArray[x] + " | ");
        }
        System.out.println("");

        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println("i - " + i + " swap(" + i + ","
                    + " findIndexofMinimum of " + findIndexOfMinimum(i) + ")");
            swap(i, findIndexOfMinimum(i));

            /*System.out.println("start at - " + i + " findIndexOfMinimum - " +
                    array[findIndexOfMinimum(i)]);
            //minValueIndex = array[findIndexOfMinimum(i)];
            swap(array[i], array[findIndexOfMinimum(i)]);*/
        }
        return sortedArray;
    }

    public static int findIndexOfMinimum(int indexToStart) {
        int minValIndex = indexToStart;
        int minVal = array[indexToStart];
        //System.out.println("minValIndex - " + indexToStart + " minVal - " + array[indexToStart]);
        for (int j = minValIndex; j < array.length; j++) {
            // System.out.println("j - " + j);
            if (array[j] < minVal) {
                minValIndex = j;
                minVal = array[j];
            }
        }
        //System.out.println("minValIndex - " + minValIndex);
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

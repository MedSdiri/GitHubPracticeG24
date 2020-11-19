package Library;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysUtility {

    // find max in an array and returns an int maximum
    public static int max(int[] arr) {
        int max = arr[0];
        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }
    public static double max(double[] arr) {
        double max = arr[0];
        for (double each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }


    // find the min in an array and returns an int minimum
    public static int min(int[] arr) {
        int min = arr[0];

        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }

        return min;
    }
    public static double min(double[] arr) {
        double min = arr[0];

        for (double each : arr) {
            if (each < min) {
                min = each;
            }
        }

        return min;
    }

    ///////////////////////////////////////////////////////

    // Takes two arrays and return one by combining the two given arrays (int, double, char, String)
    public static int[] combineTwoArrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;

        for (int each : arr1) {
            arr3[i++] = each;
        }

        for (int each : arr2) {
            arr3[i++] = each;
        }

        return arr3;
    }
    public static double[] combineTwoArrays(double[] arr1, double[] arr2) {
        double[] arr3 = new double[arr1.length + arr2.length];
        int i = 0;

        for (double each : arr1) {
            arr3[i++] = each;
        }

        for (double each : arr2) {
            arr3[i++] = each;
        }

        return arr3;
    }
    public static String[] combineTwoArrays(String[] arr1, String[] arr2) {
        String[] arr3 = new String[arr1.length + arr2.length];
        int i = 0;

        for (String each : arr1) {
            arr3[i++] = each;
        }

        for (String each : arr2) {
            arr3[i++] = each;
        }

        return arr3;
    }
    public static char[] combineTwoArrays(char[] arr1, char[] arr2) {
        char[] arr3 = new char[arr1.length + arr2.length];
        int i = 0;

        for (char each : arr1) {
            arr3[i++] = each;
        }

        for (char each : arr2) {
            arr3[i++] = each;
        }

        return arr3;
    }

    /////////////////////////////////////////////////////////

    // sort an array in decending Order (int, double, String, char)
    public static int[] sortDecend(int[] arr) {  // {3,4,1,2}
        Arrays.sort(arr);  // sorting the array
        int[] reversedArray = new int[arr.length]; // creating a new array with the same size of the intial array
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = arr[i];
        }
        return reversedArray;
    }
    public static double[] sortDecend(double[] arr) {
        Arrays.sort(arr);  // sorting the array
        double[] reversedArray = new double[arr.length]; // creating a new array with the same size of the intial array
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = arr[i];
        }
        return reversedArray;
    }
    public static char[] sortDecend(char[] arr) {  // {3,4,1,2}
        Arrays.sort(arr);  // sorting the array
        char[] reversedArray = new char[arr.length]; // creating a new array with the same size of the intial array
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = arr[i];
        }
        return reversedArray;
    }
    public static String[] sortDecend(String[] arr) {  // {3,4,1,2}
        Arrays.sort(arr);  // sorting the array {1, 2, 3, 4}
        String[] reversedArray = new String[arr.length]; // creating a new array with the same size of the intial array
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = arr[i];
        }
        return reversedArray;
    }

/////////////////////////////////////////////////////////

    // Print Array with { instead of [
    public static String printArray(int[] arr) {
        String str = Arrays.toString(arr);
        str = str.replace("[", "{").replace("]", "}");
        return str;
    }


}

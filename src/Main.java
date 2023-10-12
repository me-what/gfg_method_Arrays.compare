import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 ={6, 7, 8, 11, 18, 8, 2, 5};
        int[] array2 ={3, 5, 9, 13, 28, 6, 8, 9};
        System.out.println("Result is "+ Arrays.compare(array1,array2));


        float[] floatArray1={5.12f, 8.3f, 9.17f, 2.5f, 8.8f, 5.17f, 4.2f, 7.37f};
        float[] floatArray2={7.12f, 9.3f, 6.17f, 7.5f, 5.8f, 7.17f, 3.2f, 6.37f};
        System.out.println("Result is " + Arrays.compare(floatArray1, floatArray2));


        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 1, 2, 3, 4 };
        System.out.println("Result is " + Arrays.compare(arr1, arr2));
    }
}
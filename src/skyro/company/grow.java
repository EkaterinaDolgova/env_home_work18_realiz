package skyro.company;


import java.util.Arrays;

public class grow {
    public static void extendArraySize(int[] array, int item, int index) {
        for (int a : array) {
            System.out.print(a + " ");
        }
        int arr2[] = Arrays.copyOf(array, index + 1);
        System.out.println();
        for (int a : arr2) {
            System.out.print(a + " ");
        }
        System.out.println();
        arr2[index] = item;
        for (int a : arr2) {
            System.out.print(a + " ");
        }
    }

    public static void add(int[] ints, int item, int index) {
        if (ints.length < index) {
            extendArraySize(ints, item, index);
        }
        ints[index] = item;
        for (int a : ints) {
            System.out.print(a + " ");
        }
    }
}

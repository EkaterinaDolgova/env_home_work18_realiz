package skyro.company;


import java.util.Arrays;

public class grow {
    public static void extendArraySize(int[] array, int item, int index) {
        for (int a : array) {
        }
        double r1=array.length*1.5;
        int r = (int) r1;
        int arr2[] = Arrays.copyOf(array, r);
        for (int a : arr2) {
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
        int arrNew[] = Arrays.copyOf(ints, ints.length);
        arrNew[index] = item;
        for (int i : arrNew) {
            System.out.print(i + " ");
        }
    }
}

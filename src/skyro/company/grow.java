package skyro.company;


import java.util.Arrays;

public class grow {
    public static int[] extendArraySize(int[] array, int item, int index) {
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
        return arr2;
    }
    public static void add(int[] ints, int item, int index) {
        int arrNew[] = new int[0];
        if (ints.length < index) {
            arrNew = extendArraySize(ints, item, index);
        }

        arrNew[index] = item;
        for (int i : arrNew) {
            System.out.print(i + " ");
        }
    }
}

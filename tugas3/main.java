import java.util.Arrays;
import java.util.Scanner;

class main {

    static void counterMinPlus(int[] data) {
        int len = data.length;

        float pCount = 0;
        float nCount = 0;
        float zroCount = 0;

        for (int i = 0; i < len; i++) {
            if (data[i] > 0) {
                pCount++;
            } else if (data[i] < 0) {
                nCount++;
            } else if (data[i] == 0) {
                zroCount++;
            }
        }

        System.out.printf("\nPositif\t: %1.2f ", pCount / len);
        System.out.printf("\nNegatif\t: %1.2f ", nCount / len);
        System.out.printf("\nZero\t: %1.2f ", zroCount / len);
        System.out.println();
    }

    public static class bubbleStart {
        static void sorting(int[] inData) {
            Arrays.sort(inData);
        }
    }

    static int inData;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Size: ");
        inData = input.nextInt();
        int[] array = new int[inData];

        System.out.print("Input data: ");
        for (int i = 0; i < inData; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("\nResult: ");
        bubbleStart.sorting(array);

        for (int i = 0; i < inData; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }

        System.out.println();
        counterMinPlus(array);
    }
}
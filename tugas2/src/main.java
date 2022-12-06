import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String check;
        boolean loop = true;
        Scanner input = new Scanner(System.in);
        int search;
        int[] data = {-75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30};

        System.out.println("Data before sorting: ");
        for (int j : data) {
            System.out.print(j + " ");
        }
        System.out.println("\n");

        bubbleStart.sorting(data);
        System.out.println("Array After Bubble Sort: ");
        for (int datum : data) {
            System.out.print(datum + " ");
        }

        do {
            System.out.print("\n\nWant to search data? (Y/N): ");
            check = input.nextLine();

            switch (check.toUpperCase()) {
                case "Y" -> {
                    System.out.print("Search data: ");
                    search = input.nextInt();
                    System.out.print(search + " Found at index: ");
                    searchStart.searching(data, search);
                    loop = false;
                }
                case "N" -> {
                    System.out.println("Goodbye! :)");
                    loop = false;
                }
                default -> System.err.println("Wrong input code!");
            }
        } while (loop);

    }


    public class bubbleStart {
        static void sorting(int[] data) {
            Arrays.sort(data);
        }
    }

    public static class searchStart {
        public static int searching(int[] data, int search) {
            for (int i = 0; i < data.length; i++) {
                if (data[i] == search) {
                    System.out.print(i + " ");
                }
            }
            int newData = Arrays.binarySearch(data, search);
            return (newData < 0) ? -1 : newData;
        }
    }
}


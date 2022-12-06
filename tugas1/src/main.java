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

    public static class bubbleStart {
        static void sorting(int[] data) {
            int n = data.length;
            int temp;
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < (n - i); j++) {
                    if (data[j - 1] > data[j]) {

                        //swap elements
                        temp = data[j - 1];
                        data[j - 1] = data[j];
                        data[j] = temp;
                    }
                }
            }
        }
    }

    public static class searchStart {
        public static int count=0;
        public static String index, save;
        public static int searching(int[] data, int search) {
            System.out.print(search + " found at index: ");
            for (int i = 0; i < data.length; i++) {
                if (data[i] == search) {
                    count = count+1;
                    if(count >= 1){
                        index = i+" ";
                        save = "";
                        save = save.concat(index);
                        System.out.print(save);
                    }
                }
            }
            return 0;
        }
    }
}
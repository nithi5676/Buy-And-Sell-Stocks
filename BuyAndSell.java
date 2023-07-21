package buyAndSell;

import java.util.Scanner;

public class BuyAndSell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; ++i) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println(maximum(array));
    }

    public static int maximum(int array[]) {
        int minValue = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }
        return max - minValue;
    }

}

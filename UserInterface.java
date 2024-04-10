package task4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
    public String getDuplicateElement() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            if (size <= 0) {
                return "Array size should be positive";
            }

            int[] array = new int[size];
            
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.print("Enter the index of the array: ");
            int index = scanner.nextInt();

            if (index < 0 || index >= size) {
                return "Array index is out of range";
            }

            return "The array elements are " + arrayString(array) + " " + array[index];
        } catch (InputMismatchException e) {
            return "Input was not in the correct format";
        }
    }

    private String arrayString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int num : array) {
            sb.append(num).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        System.out.println(ui.getDuplicateElement());
    }
}

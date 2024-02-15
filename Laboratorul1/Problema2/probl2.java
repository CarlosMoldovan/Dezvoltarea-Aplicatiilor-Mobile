package Problema2;
import java.util.Scanner;

public class probl2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size for array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        
        double average = (double) sum / size;
        
        System.out.println("The average of the array elements is: " + average);
        sc.close();
    }
}

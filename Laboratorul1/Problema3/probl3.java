package Problema3;
//import java.util.Scanner;
public class probl3 {
    public static void main(String[] args) {
        findTwinPrimes(100);
    }

    public static void findTwinPrimes(int n) {
        for (int i = 2; i < n - 2; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.println("{" + i + ", " + (i + 2) + "}");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

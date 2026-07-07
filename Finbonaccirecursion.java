import java.util.Scanner;

public class Finbonaccirecursion 
{

    static int fibonnaci(int n) {
        if (n <=1 ) 
            return n;
            return fibonnaci(n - 1) + fibonnaci(n - 2);
    }
    public static void main (String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.print("Enter Number of Terms: ");
        int number = myscanner.nextInt();

        System.out.println("Fibonnaci Series (Recursion) :");
        for (int i = 0; i < number; i++) {
            System.out.print(fibonnaci(i) + " ");
        }
        myscanner.close();
    }
}


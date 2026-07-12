import java.util.Scanner;

public class Primenumber {
    
    static boolean isPrime(int n) {
        if ( n <=1)
            return false;

        for (int i = 2; i <= n/2; i++) {
            if (n % i ==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num = myscanner.nextInt();

        if(isPrime(num)) {
            System.out.println(num + "is a Prime Number");
        } else {
            System.out.println(num + "is not a Prime Number");
        }
        myscanner.close();
    }
}


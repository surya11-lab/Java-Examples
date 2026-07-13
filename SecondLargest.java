public class SecondLargest {
    public static void main(String[] args) {
    int[] arr = {10,20,5,8,25};

    int largest = Integer.MIN_VALUE;
    int SecondLargest = Integer.MIN_VALUE;

    for (int num : arr) {
        if(num > largest) {
            SecondLargest = largest;
            largest = num;
        } else if ( num > SecondLargest && num != largest) {
            SecondLargest = num;
        }
    }
    System.out.println("Second Largest:" + SecondLargest);
    }
    
}

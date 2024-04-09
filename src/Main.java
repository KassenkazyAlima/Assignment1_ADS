import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of task that you want to see (out of 10): ");
        int taskNum = sc.nextInt();
//      long startTime = System.nanoTime();

        switch (taskNum) {
            case 1:
                System.out.println("User should input a number “n” and an array of “n” elements, and the function returns minimum of them.");
                task1();
                break;
            case 2:
                System.out.println("User should input a number “n” and an array of “n” elements, and the function calculates the average of the numbers.");
                task2();
                break;
            case 3:
                System.out.println("User should input a number “n”, and the function checks whether it is prime or not.");
                task3();
                break;
            case 4:
                System.out.println("User should input a number “n”, and the function returns factorial of it.");
                task4();
                break;
            case 5:
                System.out.println("User should input a number “n”, and the function returns n-th element in Fibonacci sequence using recursion.");
                task5();
                break;
            case 6:
                System.out.println("User should input numbers “n” and “a”, and the function returns a to power of n.");
                task6();
                break;
            case 7:
                System.out.println("User should input numbers “n” and an array of “n” elements, and the function returns the given array in reverse order without using array data structure.");
                task7();
                break;
            case 8:
                System.out.println("User should input a string “s”, and the function checks whether s is all consist of digits.");
                task8();
                break;
            case 9:
                System.out.println("User should input numbers “n” and “k”, and the function calculates the binomial coefficient using the particular formula.");
                task9();
                break;
            case 10:
                System.out.println("User should input numbers “a” and “b”, and the function returns the GCD(a,b).");
                task10();
                break;
            default:
                System.out.println("Invalid Input, please enter number from 1 to 10. ");

        }
    }
    /*
    Problem 1
    This method finds the minimum element of an array by iterating through the array that user will input.
    Time complexity: O(n), where n is the input number.
    Result in linear time complexity
    @param- n, the size of elements in the array
    @return - minimum num of elements
     */
    public static void task1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        min = findMin(arr, n, min);
        System.out.println("Minimum element is: " + findMin(arr, n, min));
        System.out.println("Time taken: ");
    }
    private static int findMin(int[] arr, int n, int min) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    /*
    Problem 2
    This method calculates the average number of elements in an array by finding the sum and divide to number of elements.
    Time complexity: O(n), where n is the input number.
    Result in linear time complexity
    @param- n, the size of elements in the array
    @return - minimum num of elements
     */
    public static void task2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / n;

        System.out.println("The avegrage of numbers is: " + avg );
    }
    public static void task3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if(isPrime(n,2))
            System.out.println(n + " is prime");
        else
            System.out.println(n + " is not prime");
    }

    private static boolean isPrime(int n, int i){
        if(n<=2)
            return (n==2) ? true : false;
        if(n%i == 0)
            return false;
        if(i*i > n)
            return true;
        return isPrime(n,i+1);
    }
    public static void task4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
    private static int factorial(int n){
        if (n<=1)
            return 1;
        return factorial(n-1) * n;
    }
    public static void task5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
    private static int fibonacci(int n){
        if(n<=1)
            return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void task6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter the exponent: ");
        int n = sc.nextInt();
        System.out.println(power(a, n));
    }
    private static int power(int a,int n){
        if(n == 0)
            return 1;
        return a * power(a, n-1);
    }
    public static void task7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        reverseArray(arr,0,n-1);
        System.out.println("Reversed array : ");
        for(int num : arr){
            System.out.println(num + " ");
        }
        System.out.println();
    }
    private static void reverseArray(int[] arr, int start,int end){
        if(start>=end)
            return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr,start+1,end-1);
    }
    public static void task8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.next();
        if(isAllDigits(s))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    private static boolean isAllDigits(String s){
        if(s.isEmpty())
            return true;
        if(!Character.isDigit(s.charAt(0)))
            return false;
        return isAllDigits(s.substring(1));

    }
    public static void task9() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(binomialCoef(n,k));
    }
    private static int binomialCoef(int n, int k){
        if(k ==0 || k == n)
            return 1;
        return binomialCoef(n-1,k-1) + binomialCoef(n-1,k);
    }
    public static void task10() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gcdOfNums(a,b));
    }
    private static int gcdOfNums(int a, int b){
        if(b==0)
            return a;
        return gcdOfNums(b, a%b);

    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of task that you want to see (out of 10): ");
        int taskNum = sc.nextInt();
        long startTime = 0, endTime = 0;

        switch (taskNum) {
            case 1:
                System.out.println("User should input a number “n” and an array of “n” elements, and the function returns minimum of them.");
                startTime = System.currentTimeMillis();
                task1();
                endTime = System.currentTimeMillis();
                break;
            case 2:
                System.out.println("User should input a number “n” and an array of “n” elements, and the function calculates the average of the numbers.");
                startTime = System.currentTimeMillis();
                task2();
                endTime = System.currentTimeMillis();
                break;
            case 3:
                System.out.println("User should input a number “n”, and the function checks whether it is prime or not.");
                startTime = System.currentTimeMillis();
                task3();
                endTime = System.currentTimeMillis();
                break;
            case 4:
                System.out.println("User should input a number “n”, and the function returns factorial of it.");
                startTime = System.currentTimeMillis();
                task4();
                endTime = System.currentTimeMillis();
                break;
            case 5:
                System.out.println("User should input a number “n”, and the function returns n-th element in Fibonacci sequence using recursion.");
                startTime = System.currentTimeMillis();
                task5();
                endTime = System.currentTimeMillis();
                break;
            case 6:
                System.out.println("User should input numbers “n” and “a”, and the function returns a to power of n.");
                startTime = System.currentTimeMillis();
                task6();
                endTime = System.currentTimeMillis();
                break;
            case 7:
                System.out.println("User should input numbers “n” and an array of “n” elements, and the function returns the given array in reverse order without using array data structure.");
                startTime = System.currentTimeMillis();
                task7();
                endTime = System.currentTimeMillis();
                break;
            case 8:
                System.out.println("User should input a string “s”, and the function checks whether s is all consist of digits.");
                startTime = System.currentTimeMillis();
                task8();
                endTime = System.currentTimeMillis();
                break;
            case 9:
                System.out.println("User should input numbers “n” and “k”, and the function calculates the binomial coefficient using the particular formula.");
                startTime = System.currentTimeMillis();
                task9();
                endTime = System.currentTimeMillis();
                break;
            case 10:
                System.out.println("User should input numbers “a” and “b”, and the function returns the GCD(a,b).");
                startTime = System.currentTimeMillis();
                task10();
                endTime = System.currentTimeMillis();
                break;
            default:
                System.out.println("Invalid Input, please enter number from 1 to 10. ");
        }
        long elapsedTime = endTime - startTime;
        System.out.println("Time taken: " + elapsedTime + " milliseconds");
    }
    /*
    Problem 1
    This method finds the minimum element of an array by iterating through the array that user will input.
    Time complexity: O(n), where n is the input number.
    Result in linear time complexity
    @param- n, the size of elements in the array
    @return - minimum num of elements.
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
    @param we can consider n as the parameter which is the size of elements in the array.
    @return - average of the elements
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
    /*
   Problem 3
   This method recursively checks if a number is prime.
   Time complexity: O(sqrt(n)), where n is the input number.
   @param- n, the number to be checked for primality.
   @return - the result of boolean checking, is prime or is not prime
    */
    public static void task3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if(isPrime(n,2))
            System.out.println(n + " is prime number. ");
        else
            System.out.println(n + " is not prime number. ");

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
    /*
   Problem 4
   This method recursively calculates the factorial of the number.
   Time complexity: O(n), where n is the input number.
   Result in linear time complexity
   @param- n, the number that the factorial will be calculated
   @return - factorial of the number
    */
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
    /*
   Problem 5
   This method recursively calculates the fibonacci number at the given position
   Time complexity: O(2^n), where n is the input number.
   @param- n, the position
   @return - n-th element of fibonacci sequence.
    */
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
    /*
   Problem 6
   This method recursively calculates the power of a number
   Time complexity: O(n), where n is the input number and the exponent.
   @param- a and n, the base and the exponent
   @return - a power of n
    */
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
    /*
   Problem 7
   This method reverses the array recursively
   Time complexity: O(n), where n is the input number.
   Result in linear time complexity
   @param- arr (Array that will be reversed), start and end are used for indicating the range
   @return - reversed array
    */
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
        System.out.println("Reversed array : " );
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println(" ");
    }
    private static void reverseArray(int[] arr, int start,int end){
        if(start>=end)
            return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr,start+1,end-1);
    }
    /*
   Problem 8
   This method recursively check if a string consists of digits or not.
   Time complexity: O(n), where n is the input number.
   Result in linear time complexity
   @param String s, consisted of elements, could be digits or letters and so on
   @return - yes or no
    */
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
    /*
   Problem 9
   This method recursively calculates the binomial coefficient.
   Time complexity: O(2^n), where n is the input number.
   @param n and k, values used to calculate the binomial coefficient.
   @return - result of binomial coefficient
    */
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
    /*
   Problem 10
   This method recursively calculates the GCD using the Euclidean Algorithm.
   Time complexity: O(log(min(a,b), where a and b are the input numbers.
   @param a and b, which are the two numbers for GCD calculation
   @return - GCD of two numbers
    */
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

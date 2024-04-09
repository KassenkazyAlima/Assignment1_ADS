import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of task that you want to see (out of 10): ");
        int taskNum = sc.nextInt();
//      long startTime = System.nanoTime();

        switch (taskNum) {
            case 1:
                task1();
                break;
            case 2:
                task2();
                break;
            case 3:
                task3();
                break;
            case 4:
                task4();
                break;
            case 5:
                task5();
                break;
            case 6:
                task6();
                break;
            case 7:
                task7();
                break;
            case 8:
                task8();
                break;
            case 9:
                task9();
                break;
            case 10:
                task10();
                break;
            default:
                System.out.println("Invalid Input, please enter number from 1 to 10. ");

        }
    }

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
            System.out.println("yes");
        else
            System.out.println("no");
    }
    private static boolean isAllDigits(String s){

    }
    public static void task9() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(fibonacci(n));
    }
    private static int binomialCoef(int n, int k){
        if(k ==0)
    }
    public static void task10() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
}

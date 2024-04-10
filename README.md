This file provides an overview of my project, including instructions such as building, testing, and running the code. 


My project contains the solution to ten tasks of Laboratory1. And performs the result of them by user's input. For the first two tasks, I didn't use recursion. But it is utilized for tasks starting from the third one.
Instructors: 
Building - compile the Java source file Main.java using the Java compiler. 
Testing - after compiling the program, run the Main class by Java Interpreter.
Running - execute the compiled Java bytecode by running Java. main in the command line. 

At the start of the Main class, the program promotes the user to enter the number of the task. According to the user input, the program executes the corresponding task and meanwhile calculates the time taken for execution.
In every method including task 1 - task 10, I created a new Scanner object named sc, which is used to read input from the console.


task1() 
Responsible for finding the minimum element of the array that the user has inputted. In this method, I initialized the variable "min" with the value of the first element of the array. It assumes that the minimum element is initially the first element of the array. 
findMin() is a part of task1(), this method finds the minimum element in the array. It passes the array arr, the number of elements n, and the current minimum value min as arguments. In this method, I used a loop and inside of it I added an if statement to check if the current element (arr[i]) is less than the current minimum value (min). If it is, the current element becomes the new minimum value.

task2() 
Responsible for calculating the average of numbers in an array entered by the user. Firstly, It calculates the sum of all elements in the array using a loop. After calculating the sum, it calculates the average by dividing the sum by the number of elements. 


task3()
Responsible for checking whether the entered number is prime or not.
isPrime() method is added to perform the primality check. This method is a recursive function that checks if a number is prime by recursively dividing it by increasing divisors starting from 2.
It takes two parameters: the number n to be checked for primality and the current divisor i.
If n is less than or equal to 2, it returns true if n equals 2, indicating that 2 is prime, and false otherwise. If n is divisible by i without any remainder, it returns false, indicating that n is not prime. If the square of the current divisor i is greater than n, it returns true, indicating that n is prime. If none of the above conditions are met, it recursively calls itself with the next divisor (i+1) until one of the base cases is reached.



task4()
Responsible for calculating the factorial of a given number.
It calls the factorial() method to calculate the factorial of the input number.
This method calculates the factorial of a given number recursively.
Base Case: If the input number is less than or equal to 1, the factorial is 1.
Recursive Step: If the input number is greater than 1, the method calls itself recursively with the argument (n-1) and multiplies the result with the current value of n.


task5()
Responsible for calculating the Fibonacci number at a given position. It uses the Fibonacci () method to calculate the Fibonacci number at the given position. If the input position is 0 or 1, the Fibonacci number is equal to the position itself (0 or 1). If the input position is greater than 1, the method calls itself recursively with the arguments (n-1) and (n-2) and returns the sum of the two Fibonacci numbers.


task6()
Responsible for calculating the power of a number. It calls the `power()` method to calculate the result of raising the base number to the exponent. If the exponent is 0, the result is 1.
If the exponent is greater than 0, the method recursively calls itself with the exponent decremented by 1 until the exponent becomes 0.


task7()
Responsible for reversal of an array entered by the user. Call the reverseArray() method to reverse the elements of the array. This method reverses recursively. If the start index is greater than or equal to the end index, no further reversal is needed. The program swaps the elements at the start and end indices and recursively calls the reverseArray() method with start + 1 and end - 1 indices until the start becomes greater than or equal to the end.


task8()
Responsible for checking whether the string consists only of digits. Call the isAllDigits() method which recursively checks whether the input string consists only of digits. If the isAllDigits() method returns true, print "YES" indicating that the string consists only of digits; otherwise, print "NO".

task9()
Responsible for calculating the binomial coefficient. It calls the binomialCoef() method which recursively calculates the binomial coefficient by the inputted numbers n and k. If k is equal to 0 or k is equal to n, return 1 since these are the boundary cases where the binomial coefficient is always 1. Recursive Step: Calculate the binomial coefficient using the recursive formula C(n, k) = C(n-1, k-1) + C(n-1, k), where C(n, k) represents the binomial coefficient of n choose k.

task10()
Responsible for calculating GCD. The method gcdOfNums() calculates the GCD of two numbers a and b recursively using the Euclidean Algorithm. If b is equal to 0, return a since the GCD of any number and 0 is the number itself. Also, GCD uses the recursive formula gcd(a, b) = gcd(b, a % b), where % represents the modulo operator.


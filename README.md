This file provides an overview of my project, including instructions such as building, testing, and running the code. 


My project contains the solution to ten tasks of Laboratory1. And performs the result of them by user's input.For the first two tasks, I didn't use recursion. But it is utilized for tasks starting from the third one.
Instructores: 
Building - complie the Java source file Main.java using Java compilor. 
Testing - after cimpiling th program, run the Main class by Java Interperitor.
Running - execute the compiled Java bytecode by running Java.main in the command line. 

In the start of the Main class, program promots user to enter the number if the task. Accorging the user input, the program executes the cooresponding task, and meanwhile calculates the time taken for execution.
In every methods includes task1 - taks 10, I created a new Scanner object named sc, which is used to read input from the console.


task1() 
Responsible for finding the minimum element of the array that user has inputed. In this method, I initiolized variable "min" with the value of the first element of the array. It assumes that the minimum element is initially the first element of the array. 
findMin() is a part of task1(), this method finds the minimum element in the array. It passes the array arr, the number of elements n, and the current minimum value min as arguments.In this method, I used a loop and inside of it I added if statement to check if the current element (arr[i]) is less than the current minimum value (min). If it is, the current element becomes the new minimum value.

task2() 
Responsible for calculating the average of numbers in an array entered by the user. Firstly,It calculates the sum of all elements in the array using a loop. After calculating the sum, it calculates the average by dividing the sum by the number of elements. 


task3()
Responsible for checking whether the entered number is prime or not.
isPrime() method is added to perform the primality check.This method is a recursive function that checks if a number is prime by recursively dividing it by increasing divisors starting from 2.
It takes two parameters: the number n to be checked for primality and the current divisor i.
If n is less than or equal to 2, it returns true if n equals 2, indicating that 2 is prime, and false otherwise. If n is divisible by i without any remainder, it returns false, indicating that n is not prime. If the square of the current divisor i is greater than n, it returns true, indicating that n is prime. If none of the above conditions are met, it recursively calls itself with the next divisor (i+1) until one of the base cases is reached.





task4()
task5()
task6()
task7()
task8()
task9()
task10()


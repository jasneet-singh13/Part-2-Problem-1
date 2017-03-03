import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[]{13,10,7};
        boolean correctAnswer = true;
        do {
            System.out.println("Enter Choice between For loop, While loop and Recusion computation(f/w/r): ");
            String choice = scanner.next();

            switch (choice) {
                case "f":
                    correctAnswer = true;
                    System.out.println("Sum of numbers is :"+ SumUsingForLoop(numbers));
                    break;
                case "w":
                    correctAnswer = true;
                    System.out.println("Sum of numbers is "+ SumUsingWhileLoop(numbers));
                    break;
                case "r":
                    correctAnswer = true;
                    System.out.println("Sum of numbers is " + SumUsingRecursion(numbers, numbers.length-1));
                    break;
                default:
                    correctAnswer = false;
                    System.out.println("Please enter correct input(f/w/r)");
                    break;
            }
        } while (correctAnswer == false);
    }
    //With For loop
    private static int SumUsingForLoop(int[] arrayOfNumbers){
        int sum = 0;
        for (int i=0; i<arrayOfNumbers.length;i++){
            sum = sum + arrayOfNumbers[i];
        }
        return sum;
    }
    //With While loop
    private static int SumUsingWhileLoop(int[] arrayOfNumbers){
        int sum = 0;
        int i = 0;
        while (i < arrayOfNumbers.length){
            sum = sum + arrayOfNumbers[i];
            i++;
        }
        return sum;
    }
    //With Recursion
    private static int SumUsingRecursion(int[] arrayOfNumbers, int n){
        if (n == 0)
            return arrayOfNumbers[n];
        else
            return arrayOfNumbers[n] + SumUsingRecursion(arrayOfNumbers, n-1);
    }

}

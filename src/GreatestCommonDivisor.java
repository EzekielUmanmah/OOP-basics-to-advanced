import java.util.Scanner;

public class GreatestCommonDivisor {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter two numbers separated by space: ");
        String userInput = sc.nextLine();

        String[] inputArgumentsArray = userInput.split("\\s+");
        int number1 = Integer.parseInt(inputArgumentsArray[0]);
        int number2 = Integer.parseInt(inputArgumentsArray[1]);

        System.out.println(gcdRecursive(number1, number2));
    }

    public static int gcdRecursive(int firstNumber, int secondNumber) {
//        Euclid's Algorithm
//        Euclid's method for computing the greatest common divisor of two positive integers consists of replacing
//        the larger number by the difference of the numbers, and repeating this until the two numbers are equal:
//        that is their greatest common divisor.

//        if(firstNumber == secondNumber) return Math.abs(firstNumber);
//        if(firstNumber > secondNumber) return gcdRecursive(firstNumber - secondNumber, secondNumber);
//        return gcdRecursive(firstNumber, secondNumber - firstNumber);

//        Euclidean Algorithm
//        A more efficient method is the Euclidean algorithm, a variant in which the difference of the two numbers a and b
//        is replaced by the remainder of the Euclidean division (also called division with remainder) of a by b.
//        Denoting this remainder as a mod b, the algorithm replaces (a, b) by (b, a mod b) repeatedly until the
//        pair is (d, 0), where d is the greatest common divisor.

        if(secondNumber == 0) return Math.abs(firstNumber);
        return gcdRecursive(secondNumber, firstNumber % secondNumber);
    }

}

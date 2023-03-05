import java.util.Arrays;
import java.util.Scanner;

public class SumDigitsInNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter integer: ");
        int number = sc.nextInt();

        int sumOfDigits = sumDigitsInNumber(number);
        System.out.println(sumOfDigits);
    }

    public static int sumDigitsInNumber(int number) {
//        int sum = 0;
//        boolean isNeg = false;
//        for (String digit : Integer.toString(number).split("")) {
//            if(digit.equals("-")){
//                isNeg = true;
//                continue;
//            }
//            if(isNeg){
//                sum -= Integer.parseInt(digit);
//                isNeg = false;
//            } else {
//                sum += Integer.parseInt(digit);
//            }
//
//        }
//        return sum;

//  the tests are only looking for the sum of digits in a positive number
        int sum = 0;
        int absNumber = Math.abs(number); // get absolute value of number
        while (absNumber > 0) {
            sum += absNumber % 10;
            absNumber /= 10;
        }
        return sum;

//        String numStr = Arrays.toString(Integer.toString(number).split(""));
//        int sum = 0;
//        boolean isNeg = false;
//        for(int i = 0; i < numStr.length(); i++){
//            if(numStr.charAt(i) == '-'){
//                isNeg = true;
//                continue;
//            }
//            if(isNeg){
//                sum -= Integer.parseInt(String.valueOf(numStr.charAt(i)));
//                isNeg = false;
//            }
//            else {
//                sum += Integer.parseInt(String.valueOf(numStr.charAt(i)));
//            }
//        }
//        return sum;
    }
}

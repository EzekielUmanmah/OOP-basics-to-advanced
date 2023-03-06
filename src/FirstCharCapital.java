import java.util.Arrays;
import java.util.Scanner;

public class FirstCharCapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any text: ");
        String userInput = sc.nextLine();


        System.out.println(firstCharToTitleCase(userInput));
    }

    public static String firstCharToTitleCase(String string) {
        string = string.trim().toLowerCase().replaceAll("\\s+", " ");
        String[] stringArr = string.split(" ");

        for(int i = 0; i < stringArr.length; i++){
//            String[] temp = stringArr[i].split("");
//            temp[0] = temp[0].toUpperCase();
//            stringArr[i] = String.join("", temp);
            char firstChar = Character.toUpperCase(stringArr[i].charAt(0));
            stringArr[i] = firstChar + stringArr[i].substring(1);
        }
        return String.join(" ",  stringArr);
    }
}

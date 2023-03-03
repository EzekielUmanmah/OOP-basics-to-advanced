import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilterStringArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any words separated by space: ");
        String userInput = sc.nextLine();
        System.out.print("Please, enter minumum word length to filter words: ");
        int minLength = sc.nextInt();

        String[] words = userInput.split("\\s+");
        String[] filteredWords = filterWordsByLength(minLength, words);
        System.out.println(Arrays.toString(filteredWords));
    }

    public static String[] filterWordsByLength(int minLength, String[] words) {
        List<String> filtered = new ArrayList<>();
        for(String word:words){
            if(word.length() >= minLength) filtered.add(word);
        }
        return filtered.toArray(String[]::new);
    }

//    public static String[] filterWordsByLength(int minLength, String[] words) {
//        return Arrays.stream(words).filter(word -> word.length() >= minLength).toArray(String[]::new);
//    }

}

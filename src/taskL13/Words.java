package taskL13;

import java.util.*;

public class Words {
    public static void showUniquesAndDuplicates(){
        String[] words = {"apple", "apple", "apple", "apple", "banana",
                "banana", "lemon", "cherry", "pineapple", "pineapple",
                "kiwi", "kiwi", "strawberry", "strawberry", "watermelon",
                "mango", "orange", "coconut", "coconut", "grape"};

        Set<String> setWords = new HashSet<>();
        Collections.addAll(setWords, words);

        System.out.println("Unique elements: \n");
        for(String e: setWords){
            System.out.println(e);
        }
        System.out.println();

        System.out.println("Duplicate elements: \n");
        List<String> listWords = Arrays.asList(words);
        for(String e: setWords) {
            int occurrences = Collections.frequency(listWords, e);
            System.out.println("duplicates of " + e + ":" + occurrences);
        }
    }
}

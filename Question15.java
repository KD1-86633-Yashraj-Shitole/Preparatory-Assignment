// Input a string from the user. Count occurrences (case insensitive) of
// each alphabet in the string.
// Sample output:
// Input: Welcome to SunBeam.
// Output:
// A : 1
// B : 1
// C : 1
// E : 3
// L : 1
// M : 2
// N : 1
// O : 2
// S : 1
// T : 1
// U : 1
// W : 1

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Question15 {
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Map<Character, Integer> frequencyMap = countAlphabetOccurrences(input);

        System.out.println("Output:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        scanner.close();

    }



    public static Map<Character, Integer> countAlphabetOccurrences(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        str = str.toLowerCase();

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toUpperCase(ch);

                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
        }

        return frequencyMap;
    }

}

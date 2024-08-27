// Declare an Array of type char* (Strings) and initialize it with a few strings (hard-coded). Display the strings which are duplicated in that array. (Hint: use
// strcmp())

import java.util.HashSet;
import java.util.Set;

public class Question13 {
    public static void main(String[] args) {
        
        String[] strings = {
            "apple", "banana", "orange", "apple", "grape", "banana", "kiwi"
        };

        displayDuplicates(strings);

    }


    public static void displayDuplicates(String[] array) {
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String str : array) {
            if (seen.contains(str)) {
                duplicates.add(str);
            } else {
                seen.add(str);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println("Duplicate strings:");
            for (String duplicate : duplicates) {
                System.out.println(duplicate);
            }
        }
    }


}

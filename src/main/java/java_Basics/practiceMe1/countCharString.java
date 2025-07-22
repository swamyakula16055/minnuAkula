package java_Basics.practiceMe1;

import java.util.HashMap;
import java.util.Map;

public class countCharString {
    public static void main(String[] args) {
        String s = "Swamy Nandini Charvitha Yashoda Narayana Akula";

        // Convert to lower case if case-insensitive is needed
        // s = s.toLowerCase();

        // Optional: remove spaces if you don't want to count them
        // s = s.replace(" ", "");

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        // Print the character counts
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }
    }
    }




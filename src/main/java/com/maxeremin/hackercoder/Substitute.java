package com.maxeremin.hackercoder;

/**
 * A simple, easy to remember system for encoding integer amounts can be very useful. For example, dealers at flea markets put the information about an item on a card that they let potential buyers see. They find it advantageous to encode the amount they originally paid for the item on the card.
 * A good system is to use a substitution code, in which each digit is encoded by a letter. An easy to remember 10-letter word or phrase, the key, is chosen. Every '1' in the value is replaced by the first letter of the key, every '2' is replaced by the second letter of the key, and so on. Every '0' is replaced by the last letter of the key. Letters that do not appear in the key can be inserted anywhere without affecting the value represented by the code.. This helps to make the resulting code much harder to break (without knowing the key).
 */
import java.util.*;

public class Substitute {
    public int getValue(String key, String code) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        int last = key.length() - 1;
        for (int i = 0; i < last; i ++) {
            int k = i + 1;
            map.put(String.valueOf(key.charAt(i)), k);
        }
        map.put(String.valueOf(key.charAt(last)), 0);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < code.length(); i++) {
            if (map.get(String.valueOf(code.charAt(i))) != null)
            {
                sb.append(map.get(String.valueOf(code.charAt(i))));
            }
        }
        return Integer.parseInt(sb.toString());
    }
}

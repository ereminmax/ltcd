package com.maxeremin.quora.codility;

public class CharacterClassApi {
    public String solution(String s) {
        char c = s.charAt(0);
        if (Character.isUpperCase(c)) {  // please fix condition
            return "upper";
        } else if (Character.isLowerCase(c)) {  // please fix condition
            return "lower";
        } else if (Character.isDigit(c)) {  // please fix condition
            return "digit";
        } else {
            return "other";
        }
    }

}

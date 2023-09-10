package LeetCode;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        String[] char1 = s.split("");
        String[] char2 = t.split("");
        if(s.length() != t.length())
            return false;

        Arrays.sort(char1);
        Arrays.sort(char2);
        for(int i=0; i<char1.length; i++) {
            System.out.print(char1[i]);
        }
        System.out.println("\n");
        for(int i=0; i<char2.length; i++) {
            System.out.print(char2[i]);
        }


        for(int i=0; i<char1.length; i++) {
            if(!char1[i].equals(char2[i]))
                return false;
        }
        return true;
    }
}

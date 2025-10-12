import java.util.*;

class Solution {
    public int numDifferentIntegers(String word) {
        HashSet<String> set = new HashSet<>();
        StringBuilder num = new StringBuilder();

        for (char c : word.toCharArray()) {
            if (Character.isDigit(c)) {
                num.append(c);
            } else {
                if (num.length() > 0) {
                    set.add(removeLeadingZeros(num.toString()));
                    num.setLength(0);
                }
            }
        }

        // handle the last number if the string ends with digits
        if (num.length() > 0) {
            set.add(removeLeadingZeros(num.toString()));
        }

        return set.size();
    }

    private String removeLeadingZeros(String s) {
        int i = 0;
        while (i < s.length() && s.charAt(i) == '0') i++;
        return i == s.length() ? "0" : s.substring(i);
    }
}

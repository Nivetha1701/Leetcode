import java.util.*;

class Solution {
    public List<String> validStrings(int n) {
        List<String> res = new ArrayList<>();
        int total = 1 << n;
        for (int i = 0; i < total; i++) {
            String s = String.format("%" + n + "s", 
               Integer.toBinaryString(i)).replace(' ', '0');
            if (!s.contains("00")) res.add(s);
        }
        return res;
    }
}

import java.math.BigInteger;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        StringBuilder sb = new StringBuilder();
        for (int digit : num) sb.append(digit);

        BigInteger bigNum = new BigInteger(sb.toString());
        bigNum = bigNum.add(BigInteger.valueOf(k));

        String s = bigNum.toString();
        List<Integer> result = new ArrayList<>();
        for (char c : s.toCharArray()) {
            result.add(c - '0');
        }
        return result;
    }
}

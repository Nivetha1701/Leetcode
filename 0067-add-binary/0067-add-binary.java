import java.math.*;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger m=new BigInteger(a,2);
        BigInteger n=new BigInteger(b,2);
        BigInteger ans=m.add(n);
        return ans.toString(2);
    }
}
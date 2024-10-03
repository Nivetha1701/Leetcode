import java.math.*;
class Solution {
    public int getSum(int a, int b) {
        BigInteger c=BigInteger.valueOf(a);
        BigInteger d=BigInteger.valueOf(b);
        BigInteger e=c.add(d);
        return e.intValue();
    }
}
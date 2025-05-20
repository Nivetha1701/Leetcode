class Solution {
    public boolean judgeSquareSum(int c) {
        // b2 = c - a2;
        for(long a=0;a*a<=c;a++){
            long b=c-a*a;
            if(square(b)){
                return true;
            }
        }
        return false;
    }
    public boolean square(long b){
        long sq=(long)Math.sqrt(b);
        long num=sq*sq;
        return num==b;
    }
}
class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            int n=Integer.bitCount(i);
            if(isPrime(n)){
                count++;
            }
        }
        return count;
    }
    public static boolean isPrime(int num){
        // if(num==2 || num==3) return true;
        // if(num%2==0 || num%3==0) return false;
        if(num<=1) return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
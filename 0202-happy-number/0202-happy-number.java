class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        while(n!=1 && !set.contains(n)){
            set.add(n);
            n=getSumSquare(n);
        }
        return n==1;
    }
    public static int getSumSquare(int num){
        int sum=0;
        while(num>0){
            int a=num%10;
            int b=a*a;
            sum+=b;
            num/=10;
        }
        return sum;
    }
}
class Solution {
    public int sumBase(int n, int k) {
        String num=Integer.toString(n,k);
        int sum=0;
        for(int i=0;i<num.length();i++){
            char c=num.charAt(i);
            String s=c+"";
            sum+=Integer.parseInt(s);
        }
        return sum;
    }
}
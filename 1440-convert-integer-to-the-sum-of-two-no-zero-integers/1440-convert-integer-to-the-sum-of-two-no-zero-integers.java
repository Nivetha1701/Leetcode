class Solution {
    public int[] getNoZeroIntegers(int n) {
        int num1=0,num2=0;
        for(int i=1;i<=n;i++){
            String s1=String.valueOf(i);
            String s2=String.valueOf(n-i);
            if(i+(n-i)==n && ((!s1.contains("0")) && (!s2.contains("0")))){
                num1=i;
                num2=n-i;
                break;
            }
        }
        return new int[]{num1,num2};
    }
}
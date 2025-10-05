class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int n=digits.length;
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(i==j || j==k || i==k) continue;
                    int a=digits[i], b=digits[j], c=digits[k];
                    if(a==0 || c%2!=0) continue;
                    set.add(a*100 + b*10 + c);
                }
            }
        }
        int ans[]=new int[set.size()];
        int idx=0;
        for(int num:set){
            ans[idx++]=num;
        }
        return ans;
    }
}
class Solution {
    public int calPoints(String[] operations) {
        int ans[]=new int[operations.length];
        int idx=-1;
        for(String op:operations){
            if(op.equals("C")){
                idx--;
            } else if(op.equals("D")){
                ans[++idx]=ans[idx-1]*2;
            } else if(op.equals("+")){
                ans[++idx]=ans[idx-1]+ans[idx-2];
            } else{
                ans[++idx]=Integer.parseInt(op);
            }
        }
        int sum=0;
        for(int i=0;i<=idx;i++){
            sum+=ans[i];
        }
        return sum;
    }
}
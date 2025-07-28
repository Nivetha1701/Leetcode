class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int count[]=new int[n+1];
        for(int num:nums){
            count[num]++;
        }
        int miss=-1,duplicate=-1;
        for(int i=1;i<=n;i++){
            if(count[i]==0){
                miss=i;
            }  if(count[i]==2){
                duplicate=i;
            }
        }
        return new int[]{duplicate,miss};
    }
}
class Solution {
    public int subsetXORSum(int[] nums) {
        int n=nums.length;
        int total=1<<n;
        int xor[]=new int[total];
        xor[0]=0;
        int sum=0, count=1;
        for(int i=0;i<nums.length;i++){
            int size=count;
            for(int j=0;j<size;j++){
                int num=nums[i]^xor[j];
                xor[count]=num;
                sum+=num;
                count++; 
            }   
        }
        return sum;
    }
}
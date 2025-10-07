class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                int x=nums[i];
                int y=nums[j];
                if(Math.abs(x-y)<=Math.min(x,y)){
                    xor=Math.max(xor, (x^y));
                }
            }
        }
        return xor;
    }
}
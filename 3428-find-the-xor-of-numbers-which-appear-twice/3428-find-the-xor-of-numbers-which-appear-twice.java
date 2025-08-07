class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int count[]=new int[101];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        int xor=0;
        for(int i=0;i<count.length;i++){
            if(count[i]==2){
                xor^=i;
            }
        }
        return xor;
    }
}
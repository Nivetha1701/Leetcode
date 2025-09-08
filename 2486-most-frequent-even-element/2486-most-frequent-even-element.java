class Solution {
    public int mostFrequentEven(int[] nums) {
        int ans=-1,max=0;
        int count[]=new int[100001];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                count[nums[i]]++;
                if(count[nums[i]]>max || (count[nums[i]]==max && nums[i]<ans)){
                    max=count[nums[i]];
                    ans=nums[i];
                }
            }                                                                               
        }
        return ans;
    }
}
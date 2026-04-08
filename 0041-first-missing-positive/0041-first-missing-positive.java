class Solution {
    public int firstMissingPositive(int[] nums) {
        // Arrays.sort(nums);
        // int ans=1;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>0 && nums[i]==ans){
        //         ans++;
        //     }
        // }  
        // return ans; 
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                set.add(nums[i]);
            }
        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                return i;
            } 
        }
        return set.size()+1;
    }
}
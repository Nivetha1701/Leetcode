class Solution {
    public int majorityElement(int[] nums) {
        // int n=nums.length/2;
        // HashMap<Integer, Integer> map=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }
        // for(int num:nums){
        //     if(map.get(num)>n){
        //         return num;
        //     }
        // }
        // return -1;

        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
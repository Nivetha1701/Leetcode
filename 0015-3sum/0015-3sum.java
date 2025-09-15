class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        Set<List<Integer>> result=new HashSet<>();
        for(int i=0;i<n;i++){
            Set<Integer> set=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int target=-(nums[i]+nums[j]);
                if(set.contains(target)){
                    result.add(Arrays.asList(nums[i],nums[j],target));
                }
                set.add(nums[j]);
            }
        }
        return new ArrayList<>(result);
    }
}
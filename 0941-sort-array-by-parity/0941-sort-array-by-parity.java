class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
                even.add(nums[i]);
            else
                odd.add(nums[i]);
        }
        Collections.sort(even);
        for(int i=0;i<odd.size();i++)
        {
            even.add(odd.get(i));
        }
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=even.get(i);
        }
        return ans;
    }
}
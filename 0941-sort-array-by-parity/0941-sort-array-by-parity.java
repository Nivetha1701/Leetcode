class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int j=0;
        int ans[]=new int[n];
        for(int num:nums){
            if(num%2==0)
                ans[j++]=num;
        }
        for(int num:nums){
            if(num%2!=0)
                ans[j++]=num;
        }
        return ans;
        // ArrayList<Integer> even=new ArrayList<>();
        // ArrayList<Integer> odd=new ArrayList<>();
        // int ans[]=new int[nums.length];
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]%2==0)
        //         even.add(nums[i]);
        //     else
        //         odd.add(nums[i]);
        // }
        // Collections.sort(even);
        // for(int i=0;i<odd.size();i++)
        // {
        //     even.add(odd.get(i));
        // }
        // for(int i=0;i<nums.length;i++)
        // {
        //     ans[i]=even.get(i);
        // }
        // return ans;
    }
}
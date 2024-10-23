class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        int arr[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(!set.contains(nums[i]))
            {
                set.add(nums[i]);
                arr[j++]=nums[i];
            }
        }
        Arrays.sort(arr,0,j);
        if(j<3)
        {
            return arr[j-1];
        }
        else 
        {
            return arr[j-3];
        }
    }
}
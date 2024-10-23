class Solution {
    public int thirdMax(int[] nums) {
        int n=nums.length;
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        boolean hasmax3=false;
        for(int i=0;i<n;i++)
        {
            max1=Math.max(max1,nums[i]);
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]>max2 && nums[i]<max1)
            {
                max2=nums[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]>=max3 && nums[i]<max2 && nums[i]<max1)
            {
                max3=nums[i];
                hasmax3=true;
            }
        }
        if(hasmax3)
        {
            return max3;
        }
        return max1;
        // HashSet<Integer> set=new HashSet<>();
        // int n=nums.length;
        // int arr[]=new int[n];
        // int j=0;
        // for(int i=0;i<n;i++)
        // {
        //     if(!set.contains(nums[i]))
        //     {
        //         set.add(nums[i]);
        //         arr[j++]=nums[i];
        //     }
        // }
        // Arrays.sort(arr,0,j);
        // if(j<3)
        // {
        //     return arr[j-1];
        // }
        // else 
        // {
        //     return arr[j-3];
        // }
    }
}
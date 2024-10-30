class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            if(!set.contains(nums1[i]))
            {
                set.add(nums1[i]);
            }
        }
        HashSet<Integer> set2=new HashSet<>();
        for(int i=0;i<nums2.length;i++)
        {
            if(set.contains(nums2[i]))
            {
                set2.add(nums2[i]);
            }
        }
        int ans[]=new int[set2.size()];
        int k=0;
        Iterator<Integer> itr=set2.iterator();
        for(int i=0;i<set2.size();i++)
        {
            ans[k++]=itr.next();
        }
        return ans;
    }
}
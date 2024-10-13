class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int merged[]=new int[m+n];
        int k=0;
        for(int i=0;i<m;i++)
        {
            merged[k++]=nums1[i];
        }
        for(int j=0;j<n;j++)
        {
            merged[k++]=nums2[j];
        }
        Arrays.sort(merged);
        for(int i=0;i<merged.length;i++)
        {
            nums1[i]=merged[i];
        }   
    }
}
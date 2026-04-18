class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int m=nums1.length;
       int n=nums2.length;
       int merged[]=new int[m+n];
       int j=0;
       for(int i=0;i<m;i++){
            merged[j++]=nums1[i];
       }
       for(int i=0;i<n;i++){
            merged[j++]=nums2[i];
       }
       Arrays.sort(merged);
       int mid=merged.length/2;
       if(merged.length%2==0){
            return (double)(merged[mid]+merged[mid-1])/2;
       }
       return (double)merged[mid];
    }
}
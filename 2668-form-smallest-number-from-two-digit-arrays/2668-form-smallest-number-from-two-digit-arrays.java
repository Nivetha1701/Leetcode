class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int a:nums1){
            for(int b:nums2){
                if(a==b) return a;
            }
        }
        return Math.min(nums1[0]*10 + nums2[0], nums2[0]*10 + nums1[0]);
    }
}
// class Solution {
//     public int minNumber(int[] nums1, int[] nums2) {
//         int min=Integer.MAX_VALUE;
//         for(int i=0;i<nums1.length;i++){
//             for(int j=0;j<nums2.length;j++){
//                 String s="";
//                 if(nums1[i]==nums2[j]){
//                     s+=String.valueOf(nums1[i]);
//                 } else{
//                     if(nums1[i]<nums2[j]){
//                         s+=String.valueOf(nums1[i]);
//                         s+=String.valueOf(nums2[j]);
//                     } else{
//                         s+=String.valueOf(nums2[j]);
//                         s+=String.valueOf(nums1[i]);
//                     }
//                 }
//                 min=Math.min(Integer.parseInt(s), min);
//             }
//         }
//         return min;
//     }
// }
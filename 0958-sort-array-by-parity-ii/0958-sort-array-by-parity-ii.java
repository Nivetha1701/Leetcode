class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int res[]=new int[nums.length];
        int even=0, odd=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                res[even]=nums[i];
                even+=2;
            } else{
                res[odd]=nums[i];
                odd+=2;
            }
        }
        return res;
    }
}
// class Solution {
//     public int[] sortArrayByParityII(int[] nums) {
//         int ans1[]=new int[nums.length/2];
//         int ans2[]=new int[nums.length/2];
//         int i1=0,i2=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]%2==0){
//                 ans1[i1++]=nums[i];
//             } else{
//                 ans2[i2++]=nums[i];
//             }
//         }
//         int res[]=new int[nums.length];
//         int index=0;
//         for(int i=0;i<ans2.length;i++){
//             res[index++]=ans1[i];
//             res[index++]=ans2[i];
//         }
//         return res;
//     }
// }
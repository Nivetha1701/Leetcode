class Solution {
    public int findSpecialInteger(int[] arr) {
        int n=arr.length;
        int count=1;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                count++;
            } else{
                count=1;
            }
            if(count> n/4){
                return arr[i];
            }
        }
        return arr[0];
    }
}
// class Solution {
//     public int findSpecialInteger(int[] arr) {
//         int freq[]=new int[100001];
//         for(int i=0;i<arr.length;i++)
//         {
//             freq[arr[i]]++;
//         }
//         int f=0,max=0;
//         for(int i=0;i<arr.length;i++)
//         {
//              if(f<freq[arr[i]]){
//                 max=arr[i];
//                 f=freq[arr[i]];
//              }
//         }
//         return max;
//     }
// }
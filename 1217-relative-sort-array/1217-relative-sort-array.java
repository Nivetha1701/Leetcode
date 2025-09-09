class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> leftover=new ArrayList<>();
        int[] res=new int[arr1.length];
        int idx=0;
        for (int num:arr2){
            for (int val:arr1){
                if (val == num){
                    res[idx++] = val;
                }
            }
        }
        for (int val:arr1) {
            boolean found=false;
            for (int num:arr2) {
                if (val==num) { 
                    found = true; 
                    break; 
                }
            }
            if (!found) leftover.add(val);
        }
        Collections.sort(leftover);
        for (int val : leftover){
            res[idx++] = val;
        }
        return res;
    }
}

// class Solution {
//     public int[] relativeSortArray(int[] arr1, int[] arr2) {
//         HashSet<Integer> set=new HashSet<>();
//         int res[]=new int[arr1.length];
//         int index=0;
//         for(int i=0;i<arr2.length;i++){
//             for(int j=0;j<arr1.length;j++){
//                 if(arr1[j]==arr2[i]){
//                     res[index++]=arr1[j];
//                     if(!set.contains(arr1[j])){
//                         set.add(arr1[j]);
//                     }
//                 }
//             }
//         }
//         Arrays.sort(arr1);
//         for(int i=0;i<arr1.length;i++){
//             if(!set.contains(arr1[i])){
//                 res[index++]=arr1[i];
//             }
//         }
//         return res;
//     }
// }
class Solution {
    public boolean validMountainArray(int[] arr) {
        int n=arr.length;
        int index=-1;
        boolean ans=false;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                return false;
            }
            if(arr[i]>arr[i-1]){
                if(ans) return false;
                index=i;
            } else{
                if(index==-1 || index==0) return false;
                ans=true;
            }
        }
        return ans;
    }
}
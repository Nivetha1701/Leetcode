class Solution {
    public int findSpecialInteger(int[] arr) {
        int freq[]=new int[100001];
        for(int i=0;i<arr.length;i++)
        {
            freq[arr[i]]++;
        }
        int f=0,max=0;
        for(int i=0;i<arr.length;i++)
        {
             if(f<freq[arr[i]]){
                max=arr[i];
                f=freq[arr[i]];
             }
        }
        return max;
    }
}
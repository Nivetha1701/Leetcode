class Solution {
    public int findKthPositive(int[] arr, int k) {
        int missing=0;
        int curr=1;
        int index=0;
        while(missing<k)
        {
            if(index<arr.length && arr[index]==curr)
            {
                index++;
            }
            else 
            {
                missing++;
            }
            if(missing==k)
            {
                return curr;
            }
            curr++;
        }
        return -1;
    }
}
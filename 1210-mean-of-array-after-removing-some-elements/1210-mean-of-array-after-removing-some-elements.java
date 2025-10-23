class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        double sum=0;
        int remove=n/20;
        int count=0;
        for(int i=remove;i<n-remove;i++){
                sum+=arr[i];
                count++;
        }
        double mean = sum/count;
        return mean;
    }
}
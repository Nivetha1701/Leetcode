class Solution {
    public void duplicateZeros(int[] arr) { 
       ArrayList<Integer> al=new ArrayList<>();
       for(int i=0;i<arr.length;i++)
       {
            al.add(arr[i]);
            if(arr[i]==0 && al.size()<arr.length)
            {
                al.add(0);
            }
       }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=al.get(i);
        }  
    }
}
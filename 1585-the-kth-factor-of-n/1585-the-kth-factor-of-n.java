class Solution {
    public int kthFactor(int n, int k) {
       
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                al.add(i);
            }
        }
        if(k<=al.size()){
            return al.get(k-1);
        }
        return -1;
    }
}
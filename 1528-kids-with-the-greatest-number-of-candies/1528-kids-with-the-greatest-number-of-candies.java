class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> al=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            max=Math.max(max, candies[i]);
        }
        for(int i=0;i<candies.length;i++){
            int sum=candies[i]+extraCandies;
            if(sum>=max){
                al.add(true);
            } else{
                al.add(false);
            }
        }
        return al;
    }
}
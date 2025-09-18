class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int count=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=nums.size()-1;i>=0;i--){
            if(nums.get(i)<=k){
                set.add(nums.get(i));
            }
        }
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=nums.size()-1;i>=0;i--){
            if(nums.get(i)<=k){
                al.add(i);
                set.remove(nums.get(i));
            }
            count++;
            if(set.isEmpty()){
                return count;
            }
        }
        return count;
    }
}
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        ArrayList<Integer> al=new ArrayList<>();
        boolean flag=false;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(i+1)){
                al.add(i+1);
            }
        }
        return al;
    }
}
class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set=new HashSet<>();
        int count=0;
        for(int i=0;i<candyType.length;i++)
        {
            if(!set.contains(candyType[i]))
            {
                set.add(candyType[i]);
                count++;
            }
        }
        int n=candyType.length;
        int type=n/2;
        if(count>type)
        {
            return type;
        }
        return count;
    }
}
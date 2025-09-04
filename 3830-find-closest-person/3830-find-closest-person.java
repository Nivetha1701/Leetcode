class Solution {
    public int findClosest(int x, int y, int z) {
          int min1=Math.abs(x-z);
          int min2=Math.abs(y-z);
          int min=Math.min(min1,min2);
          if(min==min1 && min==min2) return 0;
          if(min==min1) return 1;
          else return 2;
    }
}
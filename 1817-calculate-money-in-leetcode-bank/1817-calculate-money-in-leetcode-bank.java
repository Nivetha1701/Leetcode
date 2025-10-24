class Solution {
    public int totalMoney(int n) {
        int total=0, monday=1;
        for(int i=1;i<=n;i++){
            total += monday+(i-1)%7;
            if(i%7==0) monday++;
        }
        return total;
    }
}
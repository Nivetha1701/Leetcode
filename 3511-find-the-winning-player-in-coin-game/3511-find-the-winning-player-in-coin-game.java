class Solution {
    public String winningPlayer(int x, int y) {
        int a=x*75;
        int b=y*10;
        int count=0;
        while(x>=1 && y>=4){
            count++;
            a-=75;
            b-=40;
            x--;
            y-=4;
        }
        if(count%2==0){
            return "Bob";
        }
        return "Alice";
    }
}
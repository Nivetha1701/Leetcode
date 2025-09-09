class Solution {
    public int maxNumberOfBalloons(String text) {
        char ch[]=text.toCharArray();
        Arrays.sort(ch);
        int a=0, b=0, l=0, o=0, n=0;
        for(int i=0;i<text.length();i++){
            if(ch[i]=='b') b++;
            else if(ch[i]=='a') a++;
            else if(ch[i]=='l') l++;
            else if(ch[i]=='o') o++;
            else if(ch[i]=='n') n++;
        }
        return Math.min(Math.min(Math.min(a,b),Math.min(l/2, o/2)),n);
    }
}
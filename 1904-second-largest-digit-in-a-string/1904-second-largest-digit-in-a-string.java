class Solution {
    public int secondHighest(String s) {
        int secondMax=-1,  max=-1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                int num=c-'0';
                if(num>max){
                    secondMax=max;
                    max=c-'0';
                } else if(num<max && num>secondMax){
                    secondMax=num;
                }
            } 
        }
        return secondMax;
    }
}
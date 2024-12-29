class Solution {
    public boolean equalFrequency(String word) {
        int count[]=new int[1001];
        int n=word.length();
        for(int i=0;i<n;i++){
            char s=word.charAt(i);
            count[s]++;
        }
        for(int i=0;i<n;i++){
            char s=word.charAt(i);
            count[s]--;
            int freq=-1;
            boolean valid=true;
            for(int j=0;j<1001;j++){
                if(count[j]>0){
                    if(freq==-1){
                        freq=count[j];
                    } else if(freq!=count[j]){
                        valid=false;
                        break;
                    }
                }
            }
            if(valid)
            return true;
            count[s]++;
        }
        return false;
    }
}
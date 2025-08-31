class Solution {
    public int countTriples(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            int a=i*i;
            for(int j=1;j<=n;j++){
                int b=j*j;
                int cc = a + b;
                int c=(int)Math.sqrt(cc);
                if(c<=n && c*c==cc){
                    count++;
                }
            }
        }
        return count;
    }
}
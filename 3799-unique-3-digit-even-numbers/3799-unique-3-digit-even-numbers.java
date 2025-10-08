class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<digits.length;i++){
            for(int j=0;j<digits.length;j++){
                for(int k=0;k<digits.length;k++){
                    if(i!=j && j!=k && i!=k){
                        int a=digits[i], b=digits[j], c=digits[k];
                        if(a!=0 && c%2==0){
                            int num=a*100+b*10+c;
                            set.add(num);
                        }
                    }
                }
            }
        }
        return set.size();
    }
}
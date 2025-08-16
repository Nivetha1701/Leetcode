class Solution {
    public int findComplement(int num) {
        String s1=Integer.toBinaryString(num);
        StringBuilder s=new StringBuilder();
        for(char c:s1.toCharArray()){
            s.append(c=='0' ? '1':'0');
        }
        return Integer.parseInt(s.toString(),2);
    }
}
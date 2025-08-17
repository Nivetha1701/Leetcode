class Solution {
    public int bitwiseComplement(int n) {
        String s=Integer.toBinaryString(n);
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            str.append(s.charAt(i)=='1' ?'0':'1');
        }
        return Integer.parseInt(str.toString(),2);
    }
}
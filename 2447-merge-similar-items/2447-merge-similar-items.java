class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        int freq[]=new int[1001];
        for(int i=0;i<items1.length;i++){
            freq[items1[i][0]]+=items1[i][1];
        }
        for(int i=0;i<items2.length;i++){
            freq[items2[i][0]]+=items2[i][1];
        }
        List<List<Integer>> merged=new ArrayList<>();
        for(int v=0;v<freq.length;v++){
            if(freq[v]>0){
                merged.add(Arrays.asList(v, freq[v]));
            }
        }
        return merged;
    }
}
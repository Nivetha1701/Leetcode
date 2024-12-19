class Solution {
    public int mostWordsFound(String[] sentences) {
      
        int max=0;
        for(int i=0;i<sentences.length;i++)
        {
            int wordcount=sentences[i].split(" ").length;
            if(wordcount>max)
            {
                max=wordcount;
            }
        }
        return max;
    }
}
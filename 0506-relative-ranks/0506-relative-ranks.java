class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        String result[]=new String[n];
        for(int i=0;i<n;i++){
            int rank=1;
            for(int j=0;j<n;j++){
                if(i!=j && score[j]>score[i]){
                    rank++;
                }
            }
            switch(rank){
                case 1:
                    result[i]="Gold Medal";
                    break;
                case 2:
                    result[i]="Silver Medal";
                    break;
                case 3:
                    result[i]="Bronze Medal";
                    break;
                default:
                    result[i]=Integer.toString(rank);
            }
            // if(rank==1){
            //     result[i]="Gold Medal";
            // } else if(rank==2){
            //     result[i]="Silver Medal";
            // } else if(rank==3){
            //     result[i]="Bronze Medal";
            // } else{
            //     result[i]=String.valueOf(rank);
            // }
        }
        return result;
    }
}
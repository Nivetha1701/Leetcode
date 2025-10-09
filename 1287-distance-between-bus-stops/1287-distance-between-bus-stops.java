class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int i=start;
        int n=distance.length;
        int forward=0, backward=0;
        while(i!=destination){
            forward+=distance[i];
            i=(i+1)%n;
        }
        i=destination;
        while(i!=start){
            backward+=distance[i];
            i=(i+1)%n;
        }
        return Math.min(forward, backward);
    }
}
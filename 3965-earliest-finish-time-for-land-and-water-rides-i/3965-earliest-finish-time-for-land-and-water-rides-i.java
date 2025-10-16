class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
                                  int[] waterStartTime, int[] waterDuration) {
        int minFinish = Integer.MAX_VALUE;

        for (int i = 0; i < landStartTime.length; i++) {
            for (int j = 0; j < waterStartTime.length; j++) {

                // Case 1: Land first, then Water
                int finishLand = landStartTime[i] + landDuration[i];
                int startWater = Math.max(finishLand, waterStartTime[j]);
                int finish1 = startWater + waterDuration[j];

                // Case 2: Water first, then Land
                int finishWater = waterStartTime[j] + waterDuration[j];
                int startLand = Math.max(finishWater, landStartTime[i]);
                int finish2 = startLand + landDuration[i];

                // Track minimum finish time
                minFinish = Math.min(minFinish, Math.min(finish1, finish2));
            }
        }

        return minFinish;
    }
}

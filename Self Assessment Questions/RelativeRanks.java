/*
    You are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition. All the scores are guaranteed to be unique.

    The athletes are placed based on their scores, where the 1st place athlete has the highest score, the 2nd place athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank -
        The 1st place athlete's rank is "Gold Medal".
        The 2nd place athlete's rank is "Silver Medal".
        The 3rd place athlete's rank is "Bronze Medal".
        For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").

    Return an array answer of size n where answer[i] is the rank of the ith athlete.

    Example 1 -
        Input - score = [5,4,3,2,1]
        Output - ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
        Explanation - The placements are [1st, 2nd, 3rd, 4th, 5th].

    Example 2 -
        Input - score = [10,3,8,9,4]
        Output - ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
        Explanation - The placements are [1st, 5th, 3rd, 2nd, 4th].
*/

import java.util.Arrays;

public class RelativeRanks {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int maxScore = 0;
        for(int s : score){
            if(s > maxScore){
                maxScore = s;
            }
        }
        int indices[] = new int[maxScore + 1];
        Arrays.fill(indices, -1);
        for(int i = 0; i < n; i++){
            indices[score[i]] = i;
        }

        String[] result = new String[n];
        int place = 0;
        for(int ms = maxScore; ms >= 0 && place < n; ms--){
            int index = indices[ms];
            if(index == -1) continue;
            place++;
            switch(place){
                case 1:
                    result[index] = "Gold Medal";
                    break;
                case 2:
                    result[index] = "Silver Medal";
                    break;
                case 3:
                    result[index] = "Bronze Medal";
                    break;
                default:
                    result[index] = String.valueOf(place);
            }
        }
        return result;
    }
}
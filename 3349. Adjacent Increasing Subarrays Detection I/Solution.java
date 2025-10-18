import java.util.*;
class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        int cur =0; 
        int prev = 0;
        int maxLen=0;
        for(int i=0; i<n; i++){
            cur++;
            if(i==n-1 || nums.get(i)>=nums.get(i+1)){
                maxLen = Math.max(maxLen, Math.max(cur / 2, Math.min(prev, cur)));
                prev = cur;
                prev=cur;
                cur=0;

            }
        }
        return maxLen>=k;
    }
}
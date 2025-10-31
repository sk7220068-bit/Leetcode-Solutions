import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        int [] count = new int[n+1];

        List<Integer> ans = new ArrayList<>();

        for(int i=0; i< nums.length; i++){
            int num = nums[i];
            count[num]++;
            if(count[num]==2){
                ans.add(num);
            }
        }
        return ans;
    }
}
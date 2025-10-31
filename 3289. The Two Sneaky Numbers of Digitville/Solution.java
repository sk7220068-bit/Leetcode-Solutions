class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length-2;
        int [] count = new int[n];
        int[] ans = new int[2];
        int idx =0;

        for(int i=0; i< nums.length; i++){
            int num = nums[i];
            count[num]++;
            if(count[num]==2){
                ans[idx++] = num;
            }
        }
        return ans;
    }
}
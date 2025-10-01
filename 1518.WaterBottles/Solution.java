class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while(numBottles>=numExchange){
            int curr = numBottles/numExchange;
            numBottles= numBottles-curr*numExchange+curr;
            ans+=curr;
        }
        return ans;
    }
}
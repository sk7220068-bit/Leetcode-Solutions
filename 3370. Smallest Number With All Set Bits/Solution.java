import java.util.*;
class Solution {
    public int smallestNumber(int n) {
        int ans=0;
        while(n>0){
            ans*=2;
            ans+=1;
            n/=2;
        }
        return ans;
    }
}
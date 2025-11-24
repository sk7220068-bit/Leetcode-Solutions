class Solution {
    public int reverse(int x) {
        int n=x;
        int max=Integer.MAX_VALUE;
        if(n<0){
            n*=-1;
        }
        int rev=0;
        while(n>0){
            int ld=n%10;
            if(rev>(max-ld)/10){
                return 0;
            }
            rev=rev*10+ld;
            n/=10;
        }
        if(x<0){
            return rev*=-1;
        }
        return rev;
    }
}
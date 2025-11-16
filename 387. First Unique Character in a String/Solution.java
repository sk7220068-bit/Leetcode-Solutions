class Solution {
    public int firstUniqChar(String s) {
    int [] freq = new int[26];
    char [] arr = s.toCharArray();
    for(int i=0; i<arr.length; i++){
        char c = arr[i];
        freq[c-'a']++;
    }

    for(int i=0; i<s.length(); i++){
        if(freq[s.charAt(i)-'a']==1){
            return i;
        }
    }
    return -1;

    }
}
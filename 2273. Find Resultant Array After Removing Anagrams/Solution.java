class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
        result.add(words[0]);

        for (int i = 1; i < words.length; i++) {
        char[] curr = words[i].toCharArray();
        char[] prev = words[i - 1].toCharArray();

            Arrays.sort(curr);
            Arrays.sort(prev);
            if (!Arrays.equals(curr, prev)) {
                result.add(words[i]);
            }
        }
        return result;

    }
}
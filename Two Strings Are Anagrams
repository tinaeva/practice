public class Solution {
    /**
     * @param s: The first string
     * @param b: The second string
     * @return true or false
     */
    public boolean anagram(String s, String t) {
        // write your code here
        if(s.length() != t.length()) {
            return false;
        }
        
        int[] count = new int[256];
        for(int i=0; i<s.length(); i++) {
            count[(int)s.charAt(i)]++;
        }
        for(int j=0; j<t.length(); j++) {
            count[(int)t.charAt(j)]--;
            if(count[(int)t.charAt(j)] < 0) return false;
        }
        return true;
    }
};

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        int e = overwrite_string.length() + s;
        String ans = my_string.substring(0,s) + overwrite_string + my_string.substring(e, my_string.length());
        
        return ans;
    }
}
class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0; 
        char[] codeArr = code.toCharArray();
        
        for (int idx = 0;idx < code.length(); idx++) {
            if (mode == 0) {
                if (codeArr[idx] != '1') {
                    if (idx % 2 == 0) {
                        ret += codeArr[idx];
                    }
                } else {
                    mode = 1;
                }
            } else {
                if (codeArr[idx] != '1') {
                    if (idx % 2 == 1) {
                        ret += codeArr[idx];
                    }
                } else {
                    mode = 0;
                }
            }
        }
        
        if (ret == "") {
            return "EMPTY";
        }
        
        return ret;
    }
}
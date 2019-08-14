class Solution {
    public String longestPalindrome(String s) {
        int temp = 0;   // 触手
        int max = 0;    // 最大回文串长度
        int index = 1;  // 最大回文串中心
        int range = 1;  // 最大半径
        boolean flag = true;    // true-偶数回文串; false-奇数回文串
        // 特殊情况
        if (s.length() < 2) {
            return s;
        }
        for (int i = 1; i < s.length(); i++) {
            temp = 1;
            // 可能是偶数回文串
            if (s.charAt(i-1) == s.charAt(i)) {
                while(i-1-temp >= 0 && i+temp < s.length() && s.charAt(i-1-temp) == s.charAt(i+temp)) {
                    temp++;
                }
                if (max < 2 * (temp-1) + 2) {
                    max = 2 * (temp-1) + 2;
                    index = i;
                    range = temp - 1;
                    flag = true;
                }
                temp = 1;
                while(i-temp >= 0 && i+temp < s.length() && s.charAt(i-temp) == s.charAt(i+temp)) {
                    temp++;
                }
                if (max < 2 * (temp-1) + 1) {
                    max = 2 * (temp-1) + 1;
                    index = i;
                    range = temp - 1;
                    flag = false;
                }
            } else {
                while(i-temp >= 0 && i+temp < s.length() && s.charAt(i-temp) == s.charAt(i+temp)){
                    temp++;
                }
                if (max < 2 * (temp-1) + 1) {
                    max = 2 * (temp-1) + 1;
                    index = i;
                    range = temp - 1;
                    flag = false;
                }
            }
        }
        return flag ? s.substring(index-1-range, index+range+1) : s.substring(index-range, index+range+1);
    }
}
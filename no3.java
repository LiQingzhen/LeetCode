class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = -1;    // 记录最长字符串长度
        // 当前字符串的头尾指针
        int head = 0;
        int tail = 0;
        
        while (tail < s.length()) {
            int temp = s.indexOf(s.charAt(tail), head);
            // 发现重复
            if (temp != tail) {
                head = temp + 1;
            }
            // 更新最大长度
            max = max > (tail-head) ? max : (tail-head);
            tail++;
        }
        return max + 1;
    }
}
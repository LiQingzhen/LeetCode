class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = -1;    // ��¼��ַ�������
        // ��ǰ�ַ�����ͷβָ��
        int head = 0;
        int tail = 0;
        
        while (tail < s.length()) {
            int temp = s.indexOf(s.charAt(tail), head);
            // �����ظ�
            if (temp != tail) {
                head = temp + 1;
            }
            // ������󳤶�
            max = max > (tail-head) ? max : (tail-head);
            tail++;
        }
        return max + 1;
    }
}
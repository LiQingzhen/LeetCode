class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        // 转换为HashMap
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            // 如果包含则表示找到答案，退出当前方法
            if (map.containsKey(target - nums[i])) {
                index[0] = i;
                index[1] = map.get(target - nums[i]);
                return index;
            }
            map.put(nums[i], i);
        }
        return index;
    }
}
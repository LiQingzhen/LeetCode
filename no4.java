class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int[] merge = new int[length];
        for (int i = 0, x1 = 0, x2 = 0; x1 < nums1.length || x2 < nums2.length; i++) {
            if (x1 >= nums1.length) {
                merge[i] = nums2[x2];
                x2++;
            } else if (x2 >= nums2.length) {
                merge[i] = nums1[x1];
                x1++;
            } else if (nums1[x1] > nums2[x2]){
                merge[i] = nums2[x2];
                x2++;
            } else {
                merge[i] = nums1[x1];
                x1++;
            }
        }
        return length % 2 == 0 ? (merge[length / 2 - 1] + merge[length / 2]) / 2.0 : merge[length / 2];
    }
}
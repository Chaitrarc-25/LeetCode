import java.util.*;

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int i = 0, j = 0;
        List<int[]> result = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {

            int id1 = nums1[i][0];
            int id2 = nums2[j][0];

            if (id1 == id2) {
                result.add(new int[]{id1, nums1[i][1] + nums2[j][1]});
                i++;
                j++;
            } 
            else if (id1 < id2) {
                result.add(new int[]{id1, nums1[i][1]});
                i++;
            } 
            else {
                result.add(new int[]{id2, nums2[j][1]});
                j++;
            }
        }
        // remaining elements in nums1
        while (i < nums1.length) {
            result.add(new int[]{nums1[i][0], nums1[i][1]});
            i++;
        }
        // remaining elements in nums2
        while (j < nums2.length) {
            result.add(new int[]{nums2[j][0], nums2[j][1]});
            j++;
        }
        return result.toArray(new int[result.size()][]);
    }
}
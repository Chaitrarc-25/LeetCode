import java.util.*;
class Solution {
    public int[] twoSum(int[] number, int target) {
        int left=0;
        int right=number.length -1;

        while(left<right){
            int sum=number[left] + number[right];
            if(sum==target){
                return new int[]{left+1, right+1};
            }
            else if(sum<target){
                 left++;
            }
            else{
                right--;
            }
        }
        return new int[]{};      
    }
}

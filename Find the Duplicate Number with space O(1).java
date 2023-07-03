class Solution {
    public int findDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int count;
        while(low <= high){
            int mid = low + (high - low)/2;
            count = 0;
            for(int num : nums){
                if(num <= mid){
                    count++;
                }
            }
            if (count <= mid){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
    return low;
    }
}

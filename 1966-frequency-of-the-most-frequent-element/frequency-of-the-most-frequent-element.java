class Solution {
    public int maxFrequency(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        long ans = 1;
        int l = 0;
        int r = 0;
        long total = 0;  
        
        while (r < n){
            total += nums[r];
            
            while ( nums[r] * (r - l + 1L) > total + k){
                total -= nums[l];
                l++;
            }
            
            ans = Math.max(ans, r - l + 1L);
            r++;
        }
        
        return (int)ans;
    }
}
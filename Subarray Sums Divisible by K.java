class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> remainderCount = new HashMap<>();
        int count = 0;
        int prefixSum = 0;
        for (int num : nums) {
            prefixSum = (prefixSum + num) % k;
            if (prefixSum < 0) {
                prefixSum += k;
            }
            if (prefixSum == 0) {
                count++;
            }
            if (remainderCount.containsKey(prefixSum)) {
                count += remainderCount.get(prefixSum);
            }
            remainderCount.put(prefixSum, remainderCount.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
}

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            int sum = 0;
            for (int j = i; j < nums.length; j++){
                sum += nums[j];
                if (sum % k == 0){
                    count++;
                }
            }
        }
        return count;
    }
}

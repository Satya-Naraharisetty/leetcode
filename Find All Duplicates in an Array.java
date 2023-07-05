class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0){
                duplicates.add(Math.abs(nums[i]));
            }
            else{
                nums[index] = -nums[index];
            }
        }
        return duplicates;
    }
}


Certainly! Let's go step by step to visualize the algorithm using the example input array {4, 3, 2, 7, 8, 2, 3, 1}:

1. Initialize an empty list called `duplicates` to store the duplicate elements.
   - `duplicates: []`

2. Iterate over each element in the array.

   - For the first element, 4:
     - Calculate the index: `index = |4| - 1 = 3`
     - Check if `nums[3]` is negative (not visited).
     - Mark `nums[3]` as visited by changing its sign to negative: `nums[3] = -nums[3] = -7`
   - `duplicates: []`

   - For the second element, 3:
     - Calculate the index: `index = |3| - 1 = 2`
     - Check if `nums[2]` is negative (not visited).
     - Mark `nums[2]` as visited by changing its sign to negative: `nums[2] = -nums[2] = -2`
   - `duplicates: []`

   - For the third element, 2:
     - Calculate the index: `index = |2| - 1 = 1`
     - Check if `nums[1]` is negative (not visited).
     - Mark `nums[1]` as visited by changing its sign to negative: `nums[1] = -nums[1] = -3`
   - `duplicates: []`

   - For the fourth element, 7:
     - Calculate the index: `index = |7| - 1 = 6`
     - Check if `nums[6]` is negative (not visited).
     - Mark `nums[6]` as visited by changing its sign to negative: `nums[6] = -nums[6] = -3`
   - `duplicates: []`

   - For the fifth element, 8:
     - Calculate the index: `index = |8| - 1 = 7`
     - Check if `nums[7]` is negative (not visited).
     - Mark `nums[7]` as visited by changing its sign to negative: `nums[7] = -nums[7] = -1`
   - `duplicates: []`

   - For the sixth element, 2:
     - Calculate the index: `index = |2| - 1 = 1`
     - Check if `nums[1]` is negative (already visited).
     - Add the duplicate element to the `duplicates` list: `duplicates: [2]`

   - For the seventh element, 3:
     - Calculate the index: `index = |3| - 1 = 2`
     - Check if `nums[2]` is negative (already visited).
     - Add the duplicate element to the `duplicates` list: `duplicates: [2, 3]`

   - For the eighth element, 1:
     - Calculate the index: `index = |1| - 1 = 0`
     - Check if `nums[0]` is negative (not visited).
     - Mark `nums[0]` as visited by changing its sign to negative: `nums[0] = -nums[0] = -4`
   - `duplicates: [2, 3]`

3. Return the `duplicates` list containing the duplicate elements.
   - `duplicates: [2, 3]`

So, the algorithm identifies

 the duplicate elements in the array as 2 and 3.

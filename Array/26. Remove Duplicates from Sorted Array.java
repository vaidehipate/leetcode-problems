class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;

        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }

        } return i+1;
        
    }
}

"""

Imagine you have a row of shirts in your closet.
They are already sorted by color.
You want to push all the unique colors to the front of the rack.


int i = 0;
This is your "Unique Hanger."
It stays on the very first shirt on the rack.
Since the first shirt is always the first color we've seen,
We leave it right there at index 0.

for (int j = 1; j < nums.length; j++) {
This is your "Scanning Hand."
You start at the second shirt (index 1),
and you move through the whole rack one by one.

if (nums[j] != nums[i]) {
This is the "New Color" check.
You compare the shirt your hand is touching (j),
to the last unique shirt you hung up (i).
If they are different colors,
it means you found something new!

i++;
Because you found a new color,
you slide your "Unique Hanger" one spot to the right.
This makes space for the new shirt.

nums[i] = nums[j];
You take the new color shirt your hand found (j),
and you hang it up at the new "Unique Hanger" spot (i).

If the colors were the same,
your hand (j) just moves to the next shirt and does nothing.
You effectively leave the duplicates behind.

return i + 1;
Your "Unique Hanger" (i) is an index,
so if it is at spot number 4,
it means you have 5 unique shirts in total!
You hand over that count as your final answer.

"""

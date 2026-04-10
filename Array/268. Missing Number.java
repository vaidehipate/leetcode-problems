class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        
            int actsum = n*(n+1)/2;
            int currsum = 0;

            for(int num:  nums){
               
                currsum+=num;
                
            }
            
            return  actsum - currsum;
        
        
        
    }
}

"""
THE "MISSING MARBLE" STORY

Imagine you have a box that is supposed to hold a set of numbered marbles,
starting from 0 all the way up to 'n'.
You know exactly how much the full set of marbles should weigh if none were missing.

int n = nums.length;
This is you counting how many marbles are currently in your hand.
Because one marble is missing, 
the total number of marbles that *should* be there is actually 'n'.

int actsum = n * (n + 1) / 2;
This is the "Magic Formula."
It calculates the total sum of all numbers from 0 to 'n' instantly.
Think of this as the "Perfect Weight" of the box if it were full.


int currsum = 0;
This is your "Digital Scale."
You start it at zero before you begin weighing the marbles you actually have.

for (int num : nums) { ... currsum += num; }
This is you picking up each marble from your hand,
one by one,
and putting it on the scale.
By the end of the loop,
'currsum' is the "Actual Weight" of the marbles you possess.


return actsum - currsum;
This is the "Reveal."
You take the "Perfect Weight" (what should be there),
and subtract the "Actual Weight" (what you have).
The difference is the value of the marble that rolled away!



---

The "Perfect Weight" (actsum):
You calculate what the sum *ought* to be using the math formula.

The "Actual Weight" (currsum):
You add up every number you actually see in the array.

The "Gap":
If the perfect sum is 15,
but your scale only says 12,
you immediately know the number 3 is the one missing from the party!
"""

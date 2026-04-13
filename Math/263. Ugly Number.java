class Solution {
    public boolean isUgly(int n) {

        // Rule 1: Zero or negative numbers cannot be ugly.
        if (n <= 0) {
            return false;
        }

        // Rule 2: Keep dividing by 2 as long as you can.
        while (n % 2 == 0) {
            n /= 2;
        }

        // Rule 3: Keep dividing by 3 as long as you can.
        while (n % 3 == 0) {
            n /= 3;
        }

        // Rule 4: Keep dividing by 5 as long as you can.
        while (n % 5 == 0) {
            n /= 5;
        }

        // Final Check: If only 2, 3, and 5 were factors, 
        // the number should be reduced all the way down to 1.
        return n == 1;

    }
}
"""
Imagine you have a "Filter Machine."
This machine has three special sieves:
one for the number 2,
one for the number 3,
and one for the number 5.

The Goal:
You want to see if a number is made entirely of these three ingredients.

The Process:
You pour your number into the 2-sieve.
The machine shakes it until all the 2s fall out.
Then you pour what is left into the 3-sieve.
Then you pour the rest into the 5-sieve.

The Result:
If you are left with exactly 1,
it means your number was made only of 2s, 3s, and 5s.
It is "Ugly!"
If you are left with anything else (like a 7 or an 11),
it means there was a "secret ingredient" the sieves couldn't catch.
It is "Not Ugly."
"""

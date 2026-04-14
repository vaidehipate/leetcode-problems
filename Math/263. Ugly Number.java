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

    explain like normal , not story. and exxplain n/=2 and vice versa , i didnt understood these lines

Understanding the Logic
The goal is to check if a number's only prime factors are 2, 3, and 5. If the number has any other prime factor (like 7, 11, or 13), it is not "Ugly."

Explaining the Division Shorthand
You asked about n /= 2. In Java, this is a compound assignment operator.

n /= 2 is exactly the same as writing n = n / 2.

It takes the current value of n, divides it by 2, and then updates n with that new result.

Example:
If n is 20:

n /= 2 happens.

The computer does 20/2=10.

Now n is 10.

How the Code Works (Line by Line)
1. The Base Case
if (n <= 0) { return false; }
Ugly numbers must be positive. If n is 0 or negative, we exit immediately.

2. The while loops (Removing Factors)
The code uses three while loops. A while loop keeps running as long as the condition is true.

while (n % 2 == 0) { n /= 2; }

n % 2 == 0 checks if the number is divisible by 2 (if the remainder is 0).

As long as it is divisible, we divide it by 2. We are "stripping away" all the 2s from the number.

Example with n = 12:

12 is divisible by 2? Yes. 12/2=6.

6 is divisible by 2? Yes. 6/2=3.

3 is divisible by 2? No. The loop stops.

3. Repeating for 3 and 5

while (n % 3 == 0) { n /= 3; }

Now we take that 3 and divide it by 3. 3/3=1. The loop stops.

while (n % 5 == 0) { n /= 5; }

1 is not divisible by 5, so this loop is skipped.

4. The Final Check
return n == 1;
If the number was made only of 2s, 3s, and 5s, dividing it by those factors repeatedly will eventually turn the number into 1.

If there was another factor (like 7), the loops wouldn't be able to divide it, and n would end up being 7 (or some other number). Since 7

=1, it returns false.

Example Walkthrough: n = 14
Check 2: 14 is divisible by 2. 14/2=7.

Check 2 again: 7 is not divisible by 2. Move on.

Check 3: 7 is not divisible by 3. Move on.

Check 5: 7 is not divisible by 5. Move on.

Final Result: Is n==1? No, n is 7.

Return: false (14 is not an Ugly Number).
"""

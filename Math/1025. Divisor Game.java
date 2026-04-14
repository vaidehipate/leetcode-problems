class Solution {
    public boolean divisorGame(int n) {
        return n%2==0;
    }
}

"""
Intuition
The key observation is that the game outcome depends entirely on whether n is even or odd.

If n is even, Alice can always choose an odd divisor x such that n - x becomes odd, forcing Bob into a losing position.
If n is odd, all divisors x are odd, so n - x becomes even, giving Bob the advantage.
This creates a pattern:

Even → Winning state
Odd → Losing state
Approach
Check if n is even:
If yes → return true (Alice wins)
Otherwise → return false
This works because optimal play always leads to forcing the opponent into an odd number.
Complexity
Time complexity:
O(1)
(Constant time check)

Space complexity:
O(1)
(No extra space used)

Code

class Solution {
    public int reverse(int x) {
        int rev = 0;
        while(x!=0){
        int digit = x%10;
        x=x/10;
        if (rev > Integer.MAX_VALUE/10 ) return 0;
        if (rev < Integer.MIN_VALUE/10 ) return 0;
        rev = rev*10 + digit;
        } 
        return rev;
    }
}


"""
THE "INTEGER REVERSER" LOGIC

This code takes a number (like 123) and flips it (to 321).
Think of it like taking a stack of numbered cards and restacking them one by one in reverse order.

int rev = 0; (The New Stack):
This is your empty desk where you are going to build the new, reversed number.

while (x != 0) { ... } (The Deck):
This loop keeps running as long as there are still cards (digits) left in your original stack 'x'.

int digit = x % 10; (The Pop):
This is you taking the very top card off the original deck.
Using % 10 always gives you the last digit.



x = x / 10; (The Slide):
After taking the card, you slide the remaining stack of cards to the left.
This gets rid of the digit you just used.

The "Guard Rails" (Overflow Checks):
Before you add the new digit to your reversed stack, you have to check the bridge limit.
If your current 'rev' is already larger than the maximum capacity divided by 10, 
  then multiplying it by 10 to add a new digit will definitely cause a crash (overflow).
If 'rev' is already too big, you return 0 to stop the program before it breaks.



rev = rev * 10 + digit; (The Push):
This is you putting the card onto your new stack.
You multiply the current 'rev' by 10 to move its digits over one spot.
Then you add the new 'digit' to the end.



return rev; (The Result):
Once the original stack 'x' is empty,
  you hand over your new, finished stack!
"""

class Solution {
    int x;
    
    int rev = 0;
    
    public boolean isPalindrome(int x) {
int og = x;
    int rev = 0;
    int temp = x;
    if (x<0){return false;}
        while (temp>0){
            
            int digit = temp%10;
            rev = rev*10 + digit;
            temp/=10;

        }
        return rev==og;
       
     
    }
   
}

"""

Imagine you have the number 121.
You want to see if it looks the same when flipped.

int og = x;
You take a "Original Photo" of 121.

int temp = x;
You make a "Work Copy" of 121 to tear apart.

if (x < 0) { return false; }
Negative numbers (like -121) flip to (121-).
They never match,
so you stop immediately.



while (temp > 0) {
The "Reversing Machine" starts.

int digit = temp % 10;
You grab the last digit (1).

rev = rev * 10 + digit;
You put it in your "Mirror Version."

temp /= 10;
You toss the used digit away.



}
After three rounds,
your "Mirror Version" is 121.

return rev == og;
You compare the Mirror (121) to the Photo (121).
They are twins!
You return True.


"""

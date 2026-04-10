class Solution {
    public int strStr(String haystack, String needle) {
        int hlen = haystack.length();
        int nlen = needle.length();

        for (int i = 0; i <= hlen - nlen; i++) {
            int j;
            for (j = 0; j < nlen; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {

                    break;

                }
            }
            if (j == nlen) {
                return i;
            }
        }
        return -1;

    }
}

"""
    Imagine you're searching for the word "CAT" inside a giant soup of letters.


    
for (int i = 0; i <= hlen - nlen; i++)
This is you physically moving your hand across the big string. You start at the first letter, then the second, then the third. You stop a little before the very end because if there are only 2 letters left, you know the 3-letter word "CAT" can't possibly fit there anyway.

int j;
This is your index finger. You’re going to use it to point at the letters of the small word ("CAT") one by one.

for (j = 0; j < nlen; j++)
Now, while your hand is resting at a spot on the big string, your finger starts checking: "Is the 1st letter a C? Is the 2nd an A? Is the 3rd a T?"

if (haystack.charAt(i + j) != needle.charAt(j))
This is the "Dealbreaker" line. If you're looking for "CAT" but you see "CAB", the moment your finger hits that 'B', you realize this spot is a lie.

break;
The moment you see that 'B', you stop. You don't waste time checking the rest of that spot. You pull your finger back and slide your hand over to the next starting letter in the big string.

if (j == nlen)
This is your "Victory Check." If your finger j actually finished the whole count (0, 1, 2 for "CAT"), it means you never hit that break. You found the whole word!

return i;
You shout out exactly where your hand was resting when you found the match.

return -1;
You’ve finished the whole big string, your hand has reached the end, and you never shouted out a victory. You admit defeat and say "-1".


------i+j explanation -----

The "Dealbreaker" Line: if (haystack.charAt(i + j) != needle.charAt(j))

This is where the magic (and the math) happens. To understand i + j, look at what your hand and finger are doing:

i (The Anchor): This is where your left hand is resting on the giant soup. It marks the start of the word you are currently checking.

j (The Scanner): This is your right index finger moving across the letters of "CAT" (0 for 'C', 1 for 'A', 2 for 'T').

The Problem: Your finger (j) knows it's looking at the 2nd letter of "CAT," but it needs to know which letter to look at in the giant soup.

The Solution (i + j): You add them together to get the absolute position. If your hand (i) is resting at index 10 of the soup, and your finger (j) is checking the 2nd letter (index 1), you need to look at index 10 + 1 = 11 in the soup.

Let’s visualize it with "CAT":
Imagine the soup is: B U S Y C A T S O U P
You are currently checking the spot where "CAT" might be.

- Your hand (i) is resting at the 'C' (which is index 4).
- Your finger (j) starts at 0 (the 'C' in "CAT").
  Check: Soup at (4+0) vs "CAT" at (0). It's 'C' vs 'C'. Match!
- Your finger (j) moves to 1 (the 'A' in "CAT").
  Check: Soup at (4+1) vs "CAT" at (1). It's 'A' vs 'A'. Match!
- Your finger (j) moves to 2 (the 'T' in "CAT").
  Check: Soup at (4+2) vs "CAT" at (2). It's 'T' vs 'T'. Match!


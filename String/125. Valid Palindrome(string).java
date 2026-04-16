class Solution {
    public boolean isPalindrome(String s) {
        // 1. Clean the string: filter out non-alphanumeric and make lowercase
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        
        String cleaned = sb.toString();
        
        // 2. Start the recursive mirror check
        return check(cleaned, 0);
    }

    private boolean check(String s, int i) {
        // Base Case: If we reach or pass the middle, it's a palindrome
        if (i >= s.length() / 2) {
            return true;
        }

        // Compare front character with its mirror at the back
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }

        // Move one step inward
        return check(s, i + 1);
    }
}

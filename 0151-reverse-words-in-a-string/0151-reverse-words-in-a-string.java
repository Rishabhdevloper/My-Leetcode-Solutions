class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        StringBuilder str = new StringBuilder();

        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                str.append(s.charAt(i));
            } else if (s.charAt(i) == ' ' && str.length() > 0) {
                str.reverse();
                ans.append(str).append(" ");
                str.setLength(0);  // Clear the StringBuilder for the next word
            }
        }
        
        // Handle the last word after the loop (if there's no trailing space)
        if (str.length() > 0) {
            str.reverse();
            ans.append(str);
        }

        // Remove any trailing space if it exists
        return ans.toString().trim();
    }
}

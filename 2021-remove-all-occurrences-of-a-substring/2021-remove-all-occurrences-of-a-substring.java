class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder str = new StringBuilder(s);

        while (true) {
            int a = str.indexOf(part); 
            if (a >= 0) {
                str.delete(a, a + part.length()); 
            } else {
                break; 
            }
        }

        return str.toString();
    }
}

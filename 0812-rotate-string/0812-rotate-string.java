class Solution {
    public boolean rotateString(String s, String goal) {
        if((s+s).contains(goal)&&s.length()==goal.length())return true;
       return false;
    }
}
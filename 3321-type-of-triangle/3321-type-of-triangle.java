class Solution {
    public String triangleType(int[] nums) {
        int n=nums.length;
        int a=nums[0];
        int b=nums[1];
        int c=nums[2];
        if(a+b<=c||a+c<=b||b+c<=a){
            return "none";
        }





        if(a!=b&&b!=c&&a!=c){
            return "scalene";
        }
        else if(a==b&&b==c&&a==c){
             return "equilateral";
        }
        else if(a==b||b==c||a==c){
            return "isosceles";
        }
        return null;
    }
}
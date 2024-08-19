class Solution {
    public boolean isPalindrome(int x){
        if (x<0){
            return false;
        }
        else if (x==reverse(x)){
            return true;
        }
        else
            return false;
    }
    public static int reverse(int x){
        int rev =0;
        int mod;
        while (x!=0){
        mod =x %10; 
        x /=10;
        rev = rev*10+mod;  
        }
        return rev;
    }
}
package LeetCode;

public class LeetCode9 {
    public static void main(String[] args) {
        Solution9 demo = new Solution9();
        System.out.println(demo.isPalindrome(101));
    }
}

class Solution9 {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        if(x == 0) return true;
        if(x > 0){
            int org = x;
            int rev = 0;
            while(x != 0){
                int pop = x % 10;
                x /= 10;
                rev = rev * 10 + pop;
            }
            return rev == org;
        }
        return false;
    }
}

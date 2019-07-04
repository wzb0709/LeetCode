package LeetCode;

public class ReverseString {



    public static void main(String args[]){
        char[] s = {'1','2','3','4'};
        ReverseString demo = new ReverseString();
        demo.reverseString(s);
        System.out.println(s);
    }

    private void reverseString(char[] s) {
        for(int i = 0; i < s.length / 2; i++){
            char a = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = a;
        }
    }
}

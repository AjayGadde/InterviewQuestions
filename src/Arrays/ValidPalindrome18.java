package Arrays;


// https://www.programcreek.com/2013/01/leetcode-valid-palindrome-java/

// Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
//
//For example, "Red rum, sir, is murder" is a palindrome, while "Programcreek is awesome" is not.
public class ValidPalindrome18 {


    public static void main(String[] args) {
        ValidPalindrome18 validPalindrome18 = new ValidPalindrome18();

    }


    public boolean process(String s){
        if(s==null || s.length() ==0){
            return false;
        }
        s = s.replaceAll("[^a-zA-Z0-0]","").toLowerCase();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;

    }


}

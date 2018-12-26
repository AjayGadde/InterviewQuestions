package Arrays;

public class ShortestPalindrome50 {


    public static void main(String[] args) {
        ShortestPalindrome50 shortestPalindrome50 = new ShortestPalindrome50();
        String s = shortestPalindrome50.shortestPalindrome("aacecaaa");
        System.out.println(s);
    }

    public String shortestPalindrome(String s){
        int i=0;
        int j = s.length()-1;
        while(j >=0){

            if(s.charAt(i)==s.charAt(j)){
                i++;
            }
            j--;
        }

        if(i == s.length()){
            return s;
        }
        String suffix = s.substring(i);
        String prefix = new StringBuilder(suffix).reverse().toString();
        String mid = shortestPalindrome(s.substring(0,i));
        return prefix+mid+suffix;
    }


}

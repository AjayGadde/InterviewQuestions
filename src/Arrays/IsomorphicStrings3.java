package Arrays;

import java.util.HashMap;

public class IsomorphicStrings3 {


    public static void main(String[] args) {

        IsomorphicStrings3 obj = new IsomorphicStrings3();

        String s1 = "foo";
        String s2 = "bar";
        String s3 = "add";

        System.out.println(obj.isIsomorphic(s1,s2));
        System.out.println(obj.isIsomorphic(s1,s3));
    }

    private boolean isIsomorphic(String s1, String s2){

        HashMap<Character,Character> charMap = new HashMap<Character, Character>();

        if(s1.length() != s2.length()){
            return false;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        for(int i=0; i< c1.length; i++){
            if(charMap.containsKey(c1[i])) {
                if (charMap.get(c1[i]) != c2[i]) {
                    return false;
                }
            }else{
                if(charMap.containsValue(c2[i])){
                    return false;
                }
                charMap.put(c1[i], c2[i]);
            }
        }
        return true;


    }
}

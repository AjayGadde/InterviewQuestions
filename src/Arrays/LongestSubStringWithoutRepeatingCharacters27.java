package Arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatingCharacters27 {

    public static void main(String[] args) {
        LongestSubStringWithoutRepeatingCharacters27 ls = new LongestSubStringWithoutRepeatingCharacters27();
        System.out.println(ls.lengthOfLongestSubstring("abcbcab"));
    }




        public int lengthOfLongestSubstring(String s) {
            int n = s.length(), ans = 0;
            Map<Character, Integer> map = new HashMap<>(); // current index of character
            // try to extend the range [i, j]
            for (int j = 0, i = 0; j < n; j++) {
                if (map.containsKey(s.charAt(j))) {
                    i = Math.max(map.get(s.charAt(j)), i);
                }
                ans = Math.max(ans, j - i + 1);
                map.put(s.charAt(j), j + 1);
            }
            return ans;
        }

// Second solution

//        public int lengthOfLongestSubstring(String s) {
//            int n = s.length(), ans = 0;
//            int[] index = new int[128]; // current index of character
//            // try to extend the range [i, j]
//            for (int j = 0, i = 0; j < n; j++) {
//                i = Math.max(index[s.charAt(j)], i);
//                ans = Math.max(ans, j - i + 1);
//                index[s.charAt(j)] = j + 1;
//            }
//            return ans;
//        }
}

package Arrays;


// https://leetcode.com/problems/first-bad-version/solution/
public class FirstBadVersion66 {



    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;

            if(true){  // dummy
       //     if (isBadVersion(mid)) { // api call
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}

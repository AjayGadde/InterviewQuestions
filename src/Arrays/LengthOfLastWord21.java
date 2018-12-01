package Arrays;



// https://www.programcreek.com/2014/05/leetcode-length-of-last-word-java/
public class LengthOfLastWord21 {

    public static void main(String[] args) {

    }


    public int process(String s){

        boolean flag = false;
        int len = s.length();
        int count = 0;
        for(int i=len-1; i>=0;i--){
            char c = s.charAt(i);
            if((c>='a' && c<= 'z') && (c>='A' && c<='Z')){
                flag = true;
                count++;
            }else{
                if(flag){
                    return count;
                }
            }

        }
        return count;


    }
}

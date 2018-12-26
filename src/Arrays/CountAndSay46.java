package Arrays;

public class CountAndSay46 {


    public static void main(String[] args) {
        CountAndSay46 countAndSay46 = new CountAndSay46();
        String s = countAndSay46.countAndSay(5);
        System.out.println(s);
    }

    public String countAndSay(int n){

        if(n<=0){
            return null;
        }

     String result = "1";
        int i = 1;

        while (i<n){
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for(int j=1; j < result.length(); j++){
                if(result.charAt(j) == result.charAt(j-1)){
                    count++;
                }
                else{
                    sb.append(count);
                    sb.append(result.charAt(j-1));
                    count = 1;
                }

            }
            sb.append(count);
            sb.append(result.charAt(result.length()-1));
            result = sb.toString();
            i++;

        }

        return  result;

    }




}

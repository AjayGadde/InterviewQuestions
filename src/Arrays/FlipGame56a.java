package Arrays;

import java.util.ArrayList;
import java.util.List;

public class FlipGame56a {



    public List<String> flip(String s) {

        List<String> result = new ArrayList<String>();


        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == arr[i + 1] && arr[i] == '+') {

                arr[i] = '-';
                arr[i + 1] = '-';
                result.add(new String(arr));
                arr[i] = '-';
                arr[i + 1] = '-';

            }
        }

        return result;

    }







}

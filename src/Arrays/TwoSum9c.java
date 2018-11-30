package Arrays;


import java.util.HashMap;

// https://www.programcreek.com/2014/03/two-sum-iii-data-structure-design-java/
//Design and implement a TwoSum class. It should support the following operations: add and find.
//
//        add - Add the number to an internal data structure.
//        find - Find if there exists any pair of numbers which sum is equal to the value.
//        For example,
//
//        add(1);
//        add(3);
//        add(5);
//        find(4) -> true
//        find(7) -> false
public class TwoSum9c {

    public static void main(String[] args) {

        TwoSum9c twoSum9c = new TwoSum9c();
        twoSum9c.add(1);
        twoSum9c.add(3);
        twoSum9c.add(5);
        twoSum9c.add(1);
        System.out.println(twoSum9c.find(4));
        System.out.println(twoSum9c.find(2));


    }

    HashMap<Integer, Integer> elements = new HashMap<Integer, Integer>();
    public void add(int num){
        if(elements.containsKey(num)){
            elements.put(num, elements.get(num) + 1);
        }else{
            elements.put(num, 1);
        }


    }

    public boolean find(int value){
        for(int i: elements.keySet()){
            int target = value -i;
            if(elements.containsKey(target)){
                if(i == target && elements.get(i) < 2){
                    return false;
                }
                return true;
            }
        }
        return false;
    }

}

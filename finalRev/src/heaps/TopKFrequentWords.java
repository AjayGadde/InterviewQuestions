package heaps;

import java.util.*;

public class TopKFrequentWords {



    public List<String> topKFreqWords(String[] strings, int k){


        Map<String, Integer> countMap = new HashMap<String, Integer>();
        for(String s: strings){
            countMap.put(s, countMap.getOrDefault(s,0)+1);
        }


        PriorityQueue<String> queue = new PriorityQueue<String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
               return countMap.get(o1).equals(countMap.get(o2))? o1.compareTo(o2): countMap.get(o1)-countMap.get(o2);
            }
        });

    for(String word:countMap.keySet()){
        queue.offer(word);
        if(queue.size() > k){
            queue.poll();
        }
    }

    List<String> resultList = new ArrayList<String>();
    while (!queue.isEmpty()){
        resultList.add(queue.poll());
    }
    Collections.reverse(resultList);

    return resultList;

    }




}

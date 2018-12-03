package heaps;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MeetingRooms4a {

    public static void main(String[] args) {

    }


    public int process(List<Interval> intervals){
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start-o2.start;
            }
        });

        int maxCount = 1;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        int count = 1;
        priorityQueue.offer(intervals.get(0).end);
        for(int i=1; i< intervals.size();i++) {
            Interval curr = intervals.get(i);
            if(curr.start < priorityQueue.peek()){
                count++;
                maxCount = Math.max(maxCount, count);
            }else{
                priorityQueue.poll();
            }
            priorityQueue.offer(curr.end);
        }
        return maxCount;
    }
}

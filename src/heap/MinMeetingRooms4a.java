package heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MinMeetingRooms4a {

    public static void main(String[] args) {

MinMeetingRooms4a minMeetingRooms4a = new MinMeetingRooms4a();
        Interval[] intervals = new Interval[]{
                new Interval(0,30),
                new Interval(5,10),
                new Interval(20,23),
                new Interval(25,36)
        };

        System.out.println(minMeetingRooms4a.process(intervals));
    }


    public int process(Interval[] intervals){
        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });

        PriorityQueue<Integer>  priorityQueue = new PriorityQueue<Integer>();

        int count = 1;
        priorityQueue.offer(intervals[0].end);
        for(int i = 1; i < intervals.length ; i++){
            if(intervals[i].start < priorityQueue.peek()){
                count++;
            }else{
                priorityQueue.poll();
            }
            priorityQueue.offer(intervals[i].end);
        }

        return count;


    }

}

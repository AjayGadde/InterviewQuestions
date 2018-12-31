package heaps;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MinMeetingRooms {





    public int minMeetingRoomsReq(Interval[] intervals){

        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start-o2.start;
            }
        });

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        queue.offer(intervals[0].end);
        int count = 1;

        for(int i=1; i< intervals.length; i++){
            if(intervals[i].start< queue.peek()){
                count++;
            }else{
                queue.poll();
            }
            queue.offer(intervals[i].end);
        }
    return count;





    }


}

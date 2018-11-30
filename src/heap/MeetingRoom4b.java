package heap;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoom4b {


    public static void main(String[] args) {
        MeetingRoom4b meetingRoom4b = new MeetingRoom4b();
        Interval[] intervals = new Interval[]{
                new Interval(0,3),
                new Interval(5,10),
                new Interval(20,40)
        };

        System.out.println(meetingRoom4b.process(intervals));

    }

    public boolean process(Interval[] intervals){
        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });

        Interval prev = intervals[0];
        for(int i=1; i< intervals.length; i++){
            Interval curr = intervals[1];
            if(prev.end > curr.start){
                return false;
            }
        }
        return true;
    }
}

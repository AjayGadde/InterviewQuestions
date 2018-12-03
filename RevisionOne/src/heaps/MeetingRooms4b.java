package heaps;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MeetingRooms4b {


    public static void main(String[] args) {

    }



    public boolean process(List<Interval> intervals){

        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start-o2.start;
            }
        });

        Interval prev = intervals.get(0);
        for(int i= 1; i< intervals.size();i++) {
            Interval curr = intervals.get(i);
            if (curr.start < prev.end) {
                return false;
            } else {
                prev = curr;
            }
        }

        return true;
    }
}


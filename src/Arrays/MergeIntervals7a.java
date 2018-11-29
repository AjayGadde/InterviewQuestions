package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals7a {

    public static void main(String[] args) {
        MergeIntervals7a mergeIntervals7a = new MergeIntervals7a();
        List<Interval> intervalList = new ArrayList<Interval>();
        intervalList.add(new Interval(1,3));
        intervalList.add(new Interval(15,18));
        intervalList.add(new Interval(2,6));
        intervalList.add(new Interval(8,10));
        intervalList.add(new Interval(8,11));
        mergeIntervals7a.merge(intervalList);
    }


    public List<Interval> merge(List<Interval> intervals){

//        for (Interval interval:intervals) {
//            System.out.println("["+interval.start+" , "+ interval.end+"]");
//        }

        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if(o1.start != o2.start){
                    return o1.start-o2.start;
                }else{
                    return o1.end-o2.end;
                }
            }
        });



        List<Interval> result = new ArrayList<Interval>();
        Interval pre = intervals.get(0);
        for(int i=1; i< intervals.size(); i++){
            Interval curr =intervals.get(i);
            if(pre.end < curr.start){
                result.add(pre);
                pre = curr;
            }else{
                Interval merged = new Interval(pre.start, Math.max(pre.end, curr.end));
                pre = merged;
            }
        }
        result.add(pre);

        for (Interval interval:result) {
            System.out.println("["+interval.start+" , "+ interval.end+"]");
        }
        return result;

    }

}

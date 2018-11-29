package Arrays;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval7b {

    public static void main(String[] args) {
        InsertInterval7b insertInterval7b = new InsertInterval7b();
        List<Interval> intervalList = new ArrayList<Interval>();
        intervalList.add(new Interval(1,2));
        intervalList.add(new Interval(3,5));
        intervalList.add(new Interval(6,7));
        intervalList.add(new Interval(8,10));
        intervalList.add(new Interval(12,16));
        insertInterval7b.merge(intervalList, new Interval(4,9));
    }


    public List<Interval> merge(List<Interval> intervals, Interval newInterval){
        List<Interval> result = new ArrayList<Interval>();
        for(Interval interval: intervals){
            if(interval.end < newInterval.start){
                result.add(interval);}
                else if(interval.start > newInterval.end){
                    result.add(newInterval);
                    newInterval = interval;
            }else if(interval.end >= newInterval.start || interval.start <= newInterval.end){
                newInterval = new Interval(Math.min(interval.start, newInterval.start), Math.max(newInterval.end, interval.end));
            }

        }
        result.add(newInterval);
        return result;
    }
}

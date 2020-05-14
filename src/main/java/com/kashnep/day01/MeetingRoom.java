package com.kashnep.day01;

import java.util.Arrays;
import java.util.Comparator;

class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class MeetingRoom {
    public static void main(String[] args) {
        MeetingRoom meetingRoom = new MeetingRoom();

        Interval in1 = new Interval(15, 20);
        Interval in2 = new Interval(5, 10);
        Interval in3 = new Interval(0, 30);
        Interval[] intervals = new Interval[]{in1, in2, in3};

        System.out.println(meetingRoom.solve(intervals));
    }

    public boolean solve(Interval[] intervals) {
        if (intervals == null) return false;
        print(intervals);
        Arrays.sort(intervals, Comp);
        print(intervals);
        return true;
    }

    Comparator<Interval> Comp = new Comparator<Interval>() {
        public int compare(Interval t1, Interval t2) {
            return t1.start - t2.start;
        }
    };

    public void print(Interval[] intervals) {
        for (int i = 0; i < intervals.length; i++) {
            System.out.println(intervals[i].start + " " + intervals[i].end);
        }
    }
}

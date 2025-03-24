import java.util.*;

class Solution {
    public int countDays(int days, int[][] meetings) {
        List<int[]> events = new ArrayList<>();

        for (int[] meet : meetings) {
            events.add(new int[]{meet[0], 1});   // Start of a meeting
            events.add(new int[]{meet[1] + 1, -1}); // End of a meeting
        }

        Collections.sort(events, (a, b) -> a[0] - b[0]); // Sort by day

        int freeDays = 0, ongoingMeetings = 0, prevDay = 1;

        for (int[] event : events) {
            int day = event[0], type = event[1];

            if (ongoingMeetings == 0) {
                freeDays += day - prevDay;
            }

            ongoingMeetings += type; 
            prevDay = day;
        }

        // Count remaining free days till `days`
        if (prevDay <= days) {
            freeDays += days - prevDay + 1;
        }

        return freeDays;
    }
}

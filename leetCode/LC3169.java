package leetCode;

import java.util.Arrays;

/*
3169. Count Days Without Meetings
Example 1:
Input: days = 10, meetings = [[5,7],[1,3],[9,10]]
Output: 2
Explanation:
There is no meeting scheduled on the 4th and 8th days.
Example 2:
Input: days = 5, meetings = [[2,4],[1,3]]
Output: 1
Explanation:
There is no meeting scheduled on the 5th day.
Example 3:
Input: days = 6, meetings = [[1,6]]
Output: 0
Explanation:
Meetings are scheduled for all working days.
 */
public class LC3169 {
    public static void main(String[] args) {
        int days=5;
        int[][] meetings={{2,4},{1,3}};
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        int m = 0;
        int cs = -1, ce = -1;

        for (int[] m1 : meetings) {
            int start = m1[0], end = m1[1];
            if (start > ce) {
                if (ce != -1) {
                    m += (ce - cs + 1);
                }
                cs = start;
                ce = end;
            } else {
                ce = Math.max(ce, end);
            }
        }

        if (ce != -1) {
            m += (ce - cs + 1);
        }

        System.out.println(days - m);

    }
}
/*
class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        int meetingDaysCount = 0;
        int currentStart = -1, currentEnd = -1;

        for (int[] meeting : meetings) {
            int start = meeting[0], end = meeting[1];
            if (start > currentEnd) {
                if (currentEnd != -1) {
                    meetingDaysCount += (currentEnd - currentStart + 1);
                }
                currentStart = start;
                currentEnd = end;
            } else {
                currentEnd = Math.max(currentEnd, end);
            }
        }

        if (currentEnd != -1) {
            meetingDaysCount += (currentEnd - currentStart + 1);
        }

        return days - meetingDaysCount;
    }
}
 */

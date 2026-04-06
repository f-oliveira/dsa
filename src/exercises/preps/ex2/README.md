Given the temperature data of n days, find the maximum aggregate temperature change evaluated among all the days.

Example: temperatureChange = [6, -2, 5];

The aggregate temperature change on each day is evaluated as:

For day 1, there are no preceding days information, but the day itself is included in the calculation. Temperature changes = [6] for the before period.
For succeding day, there are values [6,-2,5] and 6 + (-2)+5 = 9. Again, the change for day 1 is included. The maximum of 6 and 9 is 9.

For day 2, consider [6,-2] -> 6+(-2) = 4, and [-2,5] -> (-2) +5 = 3. The maximum of 3 and 4 is 4.

For day 3, consider [6,-2,5] -> 6 + (-2) + 5 = 9, and [5]. The maximum of 9 and 5 is 9

The maximum aggregate temperature change is max(9,4,9) = 9


Example -> [-1,2,3] - 5

Explanation:

[-1],[-1,2,3] - max(-1,4) = 4

[-1,2],[2,3] - max(1,5) = 5

[-1,2,3] [3] - max(4,3) = 4

sum each array and take their maximum. the second day is optimal with aggregate temperatye change = max(1,5) = 5
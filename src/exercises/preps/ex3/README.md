Design and implement a program to "hide duplicates of any message that has already been displayed within the past 10 seconds".

Example Messages Received, with Timestamps:

Input:

10 solar panel activated <br>
10 low battery warning <br>
11 low battery warning <br>
12 tire one: low air pressure <br>
13 solar panel activated <br>
14 low battery warning <br>
21 solar panel activated <br>
35 solar panel activated <br>

Output:

10 solar panel activated <br>
11 low battery warning <br>
12 tire one: low air pressure <br>
21 solar panel activated <br>



``class Status {
public int timestamp;
public String message;
};``

``interface StatusReceiver {
// Blocking function that will wait until the next status message is
// available and return it.
Status getRawMessage();
}
``

package exercises.preps.ex3;


import java.util.HashMap;

public class MessageFilter {
    HashMap<String, Integer> messageTimeStamp = new HashMap<>();

    public MessageFilter() {
        messageTimeStamp = new HashMap<>();
    }

    static class StatusReceiver {
        public int timestamp;
        public String message;

        StatusReceiver(int timestamp, String message) {
            this.timestamp = timestamp;
            this.message = message;
        }
    }

    public void removeDuplicateMessages(String message, int timeStamp) {
        if (!messageTimeStamp.containsKey(message) || ( timeStamp - messageTimeStamp.get(message) ) >= 10 ) {
            System.out.println(timeStamp + ":" + message);
            messageTimeStamp.put(message, timeStamp);
        }
    }

    public static void main( String[] args) {
        MessageFilter messageFilter = new MessageFilter();

        messageFilter.removeDuplicateMessages("solar panel activated", 10);
        messageFilter.removeDuplicateMessages("low battery warning", 10);
        messageFilter.removeDuplicateMessages("low battery warning", 11);
        messageFilter.removeDuplicateMessages("tire one: low air pressure", 12);
        messageFilter.removeDuplicateMessages("solar panel activated", 13);
        messageFilter.removeDuplicateMessages("low battery warning", 14);
        messageFilter.removeDuplicateMessages("solar panel activated", 21);
        messageFilter.removeDuplicateMessages("solar panel activated", 35);
    }
}




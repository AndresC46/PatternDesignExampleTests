package BehavioralPatterns.MediatorPattern;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Implements ApnaChatRoom interface and will also
 * use the number of participants involved in chatting
 * through Participant interface.
 */
public class ApnaChatRoomImpl implements ApnaChatRoom {

    //get current date time
    DateFormat dateFormat = new SimpleDateFormat("E dd-MM-yyyy hh:mm a");
    Date date = new Date();

    @Override
    public void showMsg(String msg, Participant p) {
        System.out.println(
                dateFormat.format(date).toString() +
                        "  [" + p.getName() + "] - " +
                    msg
        );
    }

} // end class

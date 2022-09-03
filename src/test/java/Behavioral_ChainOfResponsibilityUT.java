import BehavioralPatterns.ChainOfResponsibility.ChainofResponsibilityClient;

import org.junit.jupiter.api.Test;
import BehavioralPatterns.ChainOfResponsibility.Logger;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 *  In chain of responsibility, sender sends a request to a chain of objects.
 *  The request can be handled by any object in the chain.
 *
 *  In other words, we can say that normally each receiver contains reference of another receiver.
 *  If one object cannot handle the request then it passes the same to the next receiver and so on.
 */
public class Behavioral_ChainOfResponsibilityUT {

    @Test
    public void givenLogger_whenInfo_thenInfoLog(){
        Logger chainLogger = ChainofResponsibilityClient.doChaining();
        String log = chainLogger.logMessage(Logger.OUTPUTINFO, "Enter the sequence of values ");
        System.out.println(log);
        assertTrue(log.contains("- 1"));
    }

    @Test
    public void givenLogger_whenError_thenErrorLog(){
        Logger chainLogger = ChainofResponsibilityClient.doChaining();
        String log = chainLogger.logMessage(Logger.ERRORINFO, "An error has occurred now");
        System.out.println(log);
        assertTrue(log.contains("- 2"));
    }

    @Test
    public void givenLogger_whenDebug_thenDebugLog(){
        Logger chainLogger = ChainofResponsibilityClient.doChaining();
        String log = chainLogger.logMessage(Logger.DEBUGINFO, "This was the error, debugging is now completed");
        System.out.println(log);
        assertTrue(log.contains("- 3"));
    }

}

package BehavioralPatterns.ChainOfResponsibility;

public abstract class Logger {

    public static int OUTPUTINFO = 1;
    public static int ERRORINFO = 2;
    public static int DEBUGINFO = 3;
    protected int levels;
    protected Logger nextLevelLogger;


    public void setNextLevelLogger(Logger nextLevelLogger)
    {
        this.nextLevelLogger = nextLevelLogger;
    }

    public String logMessage(int levels, String msg){
        String msgLogged = "";
        if(this.levels <= levels){
            msgLogged = msg;
        }

        if (nextLevelLogger!=null) {
            //displayLogInfo("Handle at next level: " + msg);
            msgLogged = "Handle at next level";
           nextLevelLogger.logMessage(levels, msg);
        }
        return String.format("Log Level - %s :", levels) + msg;
    }

    protected abstract void displayLogInfo(String msg);

} // end class

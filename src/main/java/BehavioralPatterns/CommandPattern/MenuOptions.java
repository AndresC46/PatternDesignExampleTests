package BehavioralPatterns.CommandPattern;

public class MenuOptions {
    private ActionListenerCommand openCommand;
    private ActionListenerCommand saveCommand;

    public MenuOptions(ActionListenerCommand open, ActionListenerCommand save) {
        this.openCommand = open;
        this.saveCommand = save;
    }
    public boolean clickOpen(){
        openCommand.execute();
        return true;
    }
    public boolean clickSave(){
        saveCommand.execute();
        return true;
    }

} // end class

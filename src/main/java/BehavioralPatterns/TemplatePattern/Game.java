package BehavioralPatterns.TemplatePattern;

/**
 * Game abstract class
 */
public abstract class Game {

    abstract void initialize();
    abstract void start();
    abstract void end();

    public final String play(){

        //initialize the game
        initialize();

        //start game
        start();

        //end game
        end();

        return "Played Game";
    }

} // end class

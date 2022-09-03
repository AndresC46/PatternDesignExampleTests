import BehavioralPatterns.IteratorPattern.CollectionOfNames;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

/**
 * Iterator Pattern is used "to access the elements of an aggregate object
 * sequentially without exposing its underlying implementation".
 *
 * The Iterator pattern is also known as Cursor.
 *
 * Advantage of Iterator Pattern
 * It supports variations in the traversal of a collection.
 * It simplifies the interface to the collection.
 *
 * Usage of Iterator Pattern:
 *
 * When you want to access a collection of objects without exposing its internal representation.
 * When there are multiple traversals of objects need to be supported in the collection.
 */
public class Behavioral_IteratorPatternUT {

    @Test
    public void given_when_then(){
        CollectionOfNames companyRepository = new CollectionOfNames();

        for(Iterator iter = companyRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }

    }  // end test

} // end class

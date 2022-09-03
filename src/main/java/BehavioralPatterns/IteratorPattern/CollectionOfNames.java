package BehavioralPatterns.IteratorPattern;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Create a Collection of Names class that will implement Container interface.
 */
public class CollectionOfNames implements Container {

    public String[] name = {
            "Anna Tijana",
            "Mocho Corto",
            "Armando Bronca",
            "Enemencio Rodriguez",
            "Fefita La Grande"
    };

    @Override
    public Iterator getIterator() {
        return new CollectionOfNamesIterate() ;
    }

    private class CollectionOfNamesIterate implements Iterator {
        int i;
        /**
         * Returns {@code true} if the iteration has more elements.
         * (In other words, returns {@code true} if {@link #next} would
         * return an element rather than throwing an exception.)
         *
         * @return {@code true} if the iteration has more elements
         */
        @Override
        public boolean hasNext() {
            if (i < name.length){
                return true;
            }
            return false;
        }

        /**
         * Returns the next element in the iteration.
         *
         * @return the next element in the iteration
         * @throws NoSuchElementException if the iteration has no more elements
         */
        @Override
        public Object next() {
            if(this.hasNext()){
                return name[i++];
            }
            return null;
        }
    }


} // end class


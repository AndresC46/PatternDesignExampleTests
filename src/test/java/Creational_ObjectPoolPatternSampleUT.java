import CreationalPatterns.ObjectPoolPattern.ObjectPoolDemo;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for Object Pool Pattern:
 * to reuse the object that are expensive to create.
 *
 * Basically, an Object pool is a container which contains a specified amount of
 * objects. When an object is taken from the pool, it is not available in the pool
 * until it is put back. Objects in the pool have a lifecycle: creation, validation and destroy.
 *
 * A pool helps to manage available resources in a better way.
 * There are many using examples: especially in application servers there are data source pools, thread pools etc.
 */
public class Creational_ObjectPoolPatternSampleUT {

   @Test
    public void givenAnObjectPool_when8ThreadTasksExecute_thenShutdownSuccessfully(){
       //Build Object Pool
       ObjectPoolDemo op=new ObjectPoolDemo();

       // Setup Object Pool
       op.setUp();

       // Tear Down Object Pool and Verify
       op.tearDown();
       op.testObjectPool();
   }

}  // end class

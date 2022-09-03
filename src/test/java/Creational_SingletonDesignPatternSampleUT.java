import CreationalPatterns.SingletonDesignPattern.BaeldungSynchronizedMethods;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;
import CreationalPatterns.SingletonDesignPattern.BaeldungNonSynchronizedMethods;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Creational_SingletonDesignPatternSampleUT {

    @Test
    public void givenMultiThreads_whenNonSyncMethod_thenAtLeastOneThreadLessThan1000() throws InterruptedException {
        //  race condition occurs when two or more threads attempt to update mutable shared data at the same time
        ExecutorService service = Executors.newFixedThreadPool(5);
        BaeldungNonSynchronizedMethods summation = new BaeldungNonSynchronizedMethods();

        IntStream.range(0, 1000)
                .forEach(count -> {
                    service.submit(summation::calculate);
                });
        service.awaitTermination(1000, TimeUnit.MILLISECONDS);

        if(1000 != summation.getSum()){
            System.out.println("Summation number not expected 1000, instead: " + summation.getSum());
        }

        assertTrue(true);
    }

    @Test
    public void givenMultiThreads_whenSyncMethod_thenThreadHas1000() throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(5);
        BaeldungSynchronizedMethods summation = BaeldungSynchronizedMethods.getInstance();

        IntStream.range(0, 1000)
                .forEach(count -> {
                    service.submit(summation::calculate);
                });
        service.awaitTermination(1000, TimeUnit.MILLISECONDS);

        if(1000 != summation.getSum()){
            System.out.println("Error Summation number not expected 1000, instead: " + summation.getSum());
        }

        assertEquals(1000, summation.getSum());
    }

}

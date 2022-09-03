import CreationalPatterns.FactoryMethod.GetPlanFactory;
import CreationalPatterns.FactoryMethod.Plan;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;




/**
 * Sample for Factory Method pattern:
 * Define an interface or abstract class for creating an object but lets the subclasses decide which class to instantiate.
 * In other words, subclasses are responsible to create the instance of the class.
 */
public class Creational_FactoryDesignSampleUT {
    boolean debug = false;
    Logger logger = LoggerFactory.getLogger("TDD_EventLogger");

    /**
     * Generate Bill by using the CreationalPatterns.FactoryMethod.GetPlanFactory to get the object of concrete classes
     * by passing an information such as type of plan DOMESTICPLAN or COMMERCIALPLAN
     * or INSTITUTIONALPLAN.
     */
    @Test
    public void factoryMethodDesignPatternDomesticPlan() throws IOException {
        //
        GetPlanFactory planFactory = new GetPlanFactory();
        double expectedBill = 1750.0;

        String planName = "DOMESTIC_PLAN";
        Integer units = 500;

        Plan p = planFactory.getPlan(planName);

        double rate = p.getRate();
        double billAmount = p.calculateBill(units);
        System.out.println("Bill rate of "+ rate + " amount for " + planName+" of "+units+" units is: " + billAmount);
        assertEquals(expectedBill, billAmount);
    }



}


import CreationalPatterns.PrototypeDesignPattern.EmployeeRecord;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Sample for Prototype Design pattern:
 * Cloning of an existing object instead of creating new one (becuase of complexities or expense)
 * and can also be customized as per the requirement.
 * Prototype pattern refers to creating duplicate object while keeping performance in mind.
 * This type of design pattern comes under creational pattern as this pattern provides
 * one of the best ways to create an object.
 */
public class Creational_PrototypeDesignPatternSampleUT {

    @Test
    public void givenEmployee_whenCreated_thenCloneProtoype(){
        // Variables
        int eid = 101;
        String ename = "Chris Judas";
        String edesignation = "Pain Maker";
        String eaddress = "321 Bad Street USA";
        double esalary = 60000;

        // Print out Data
        System.out.println("\nEnter Employee Id:          " + eid);
        System.out.println("Enter Employee Name:        " + ename);
        System.out.println("Enter Employee Designation: " + edesignation);
        System.out.println("Enter Employee Address:     " + eaddress);
        System.out.println("Enter Employee Salary:      " + esalary);
        System.out.println("");

        EmployeeRecord e1 = new EmployeeRecord(eid,ename,edesignation,esalary,eaddress);
        e1.showRecord();
        System.out.println("\n");

        // Clone Object
        EmployeeRecord e2 = (EmployeeRecord) e1.getClone();
        e2.showRecord();

        assertEquals(e1.getName(),e2.getName());
    }

}

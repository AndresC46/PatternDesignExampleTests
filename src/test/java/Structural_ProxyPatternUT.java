import StructuralPatterns.ProxyPattern.OfficeInternetAccess;
import StructuralPatterns.ProxyPattern.ProxyInternetAccess;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Proxy means an object representing another object.
 * According to GoF, a Proxy Pattern "provides the control for accessing the original object".
 * So, we can perform many operations like hiding the information of original object, on demand loading etc.
 *
 * Proxy pattern is also known as Surrogate or Placeholder.
 */
public class Structural_ProxyPatternUT {

    // For these tests access granted for Authorization Levels of 4 or more

    @Test
    public void givenUnauthorized_whenCheckAccess_thenNotGranted(){
        // Ashwani has an access level of 3
        OfficeInternetAccess access = new ProxyInternetAccess("Ashwani Rajput");
        String accessLevel = access.grantInternetAccess();
        System.out.println("Access: "+ accessLevel);
        assertEquals("Access not granted", accessLevel);
    }

    @Test
    public void givenAuthorized_whenCheckAccess_thenGranted(){
        // Mr. Bacon has an access level of 6
        OfficeInternetAccess access = new ProxyInternetAccess("Chris P. Bacon");
        String accessLevel = access.grantInternetAccess();
        System.out.println("Access: "+ accessLevel);
        assertEquals("Access granted", accessLevel);
    }


} // end class

package StructuralPatterns.ProxyPattern;

import java.util.HashMap;
import java.util.Map;

public class ProxyInternetAccess implements OfficeInternetAccess {
    String employeeName = "";
    private RealInternetAccess  realaccess;
    Map<String, Integer> employeeLevel = new HashMap<String, Integer>();

    public ProxyInternetAccess(String employeeName) {
        this.employeeName = employeeName;
        employeeLevel.put("Ashwani Rajput", 3);
        employeeLevel.put("Chris P. Bacon", 6);
    }

    @Override
    public String grantInternetAccess() {
        String accessResult = null;
        if (getRole(employeeName) > 4)
        {
            realaccess = new RealInternetAccess(employeeName);
            realaccess.grantInternetAccess();
            accessResult = "Access granted";
        } else {
            accessResult = "Access not granted";
        }
        return accessResult;
    }

    /**
     *
     * @param employeeName name of employee
     * @return role int v
     */
    public int getRole(String employeeName) {
        // Check role from the database based on Name and designation
        // return job level or job designation.
        return (employeeLevel.containsKey(employeeName))? employeeLevel.get(employeeName) : 0;
    }

}

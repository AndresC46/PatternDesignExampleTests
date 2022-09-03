package StructuralPatterns.ProxyPattern;

/**
 * Implements OfficeInternetAccess interface for granting the permission to the specific employee.
 */
public class RealInternetAccess implements OfficeInternetAccess {

    private String employeeName;

    public RealInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public String grantInternetAccess() {
        return employeeName;
    }
}

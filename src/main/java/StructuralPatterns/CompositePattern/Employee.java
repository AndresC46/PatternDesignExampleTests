package StructuralPatterns.CompositePattern;

import java.util.List;

/**
 * Employee Interface that will be treated as a Component
 */
public interface Employee {
    public  int getId();
    public String getName();
    public double getSalary();
    public void print();
    public void add(Employee employee);
    public void remove(Employee employee);
    public Employee getChild(int i);
    public List<Employee> getEmployees();
}

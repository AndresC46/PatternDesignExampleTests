package CreationalPatterns.PrototypeDesignPattern;

public class EmployeeRecord implements Prototype {

    private int id;
    private String name, designation;
    private double salary;
    private String address;

    // Setter Getters
    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}

    public EmployeeRecord(){
        System.out.println("   Employee Records of Oracle Corporation ");
        System.out.println("---------------------------------------------");
        System.out.println("Eid"+"\t"+"Ename"+"\t\t"+"Edesignation"+"\t"+"Esalary"+"\t\t"+"Eaddress");
    }

    public EmployeeRecord(int id, String name, String designation, double salary, String address) {
        this();
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
    }

    public void showRecord(){
        System.out.println(id+"\t"+name+"\t"+designation+"\t\t"+salary+"\t\t"+address);
    }

    @Override
    public Prototype getClone() {
        return new EmployeeRecord(id,name,designation,salary,address);
    }

}
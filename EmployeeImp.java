
package Task15;
class Employee{
    private int empId;
    private String empName;

    public Employee(int empId , String empName){
        this.empId=empId;
        this.empName=empName;
    }

    public double calculateSalary(){
        return 0.0;
    }

    public int getId(){
        return empId;
    }

    public String getName(){
        return empName;
    }


}
class PermanentEmplpoyee extends Employee{
    private double salary;

    public PermanentEmplpoyee(int empId,String empName , double salary){
        super(empId, empName);
        this.salary=salary;
    }
    
    public double calculateSalary(){
        return salary;
    }

}
class PartTimeEmplpoyee extends Employee{
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmplpoyee(int empId, String empName,double hourlyRate, int hoursWorked){
            super(empId, empName);
            this.hourlyRate=hourlyRate;
            this.hoursWorked=hoursWorked;
    }

    public double calculateSalary(){
        return hourlyRate*hoursWorked;
    }

}
class ContractEmplpoyee extends Employee{
    private float contractRate;

    public ContractEmplpoyee(int empId,String empName,float contractRate){
        super(empId, empName);
        this.contractRate=contractRate;
    }

    public double calculateSalary(){
        return contractRate;
    }
    


}

public class EmployeeImp{
    public static void main(String[] args) {


        Employee emp1=new PermanentEmplpoyee(1,"sumadeep",12000);
        
        Employee emp2=new PartTimeEmplpoyee(2, "charan", 80, 10);
        
        Employee emp3=new ContractEmplpoyee(3, "deepak", 10000);
        System.out.println();
        
        Employee [] employees={emp1,emp2,emp3};

        for(Employee emp:employees){
            System.out.println("name  : "+emp.getName()+"- empolyee id is : " +emp.getId()+" -salary is  : " +emp.calculateSalary());
        }



    }


}

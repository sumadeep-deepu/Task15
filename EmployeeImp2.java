package Task15;

import java.util.HashMap;

class Employee{
    private int empId;
    private String empName;

    public Employee(int empId , String empName){
        this.empId=empId;
        this.empName=empName;
    }

    public int getId(){
        return empId;
    }

    public String getName(){
        return empName;
    }
}

public class EmployeeImp2{

    private HashMap <Integer,Employee> employeemap;

    public EmployeeImp2(){
        employeemap=new HashMap<>();
    }

    public void addEmployee(int empId,String empName){

        Employee newEmployee=new Employee(empId, empName);
        employeemap.put(empId, newEmployee);

    }



    public void modifyEmployee(int empId,String newName){
        if(employeemap.containsKey(empId)){
            Employee employee=employeemap.get(empId);
            employeemap.put(empId, new Employee(empId, newName));
        }

        else{
            System.out.println("employee not found with provided id");
        }

    }



    public void deleteEmployee(int empId){
        if(employeemap.containsKey(empId)){
            employeemap.remove(empId);
        }
        else{
            System.out.println("employee not found with provided id");
        }
    }


    public Employee searchEmployee(int empId){
        if(employeemap.containsKey(empId)){
            return employeemap.get(empId);
        }
        else{
            return null;
        }

    }



    public void listEmployees(){
        for(Employee employee:employeemap.values()){
            System.out.println("employee id : "+employee.getId()+" employee name : "+employee.getName());
        }

    }



    public static void main(String[] args) {
        EmployeeImp2 emp=new EmployeeImp2();

        emp.addEmployee(1, "sumadeep");
        emp.addEmployee(2, "charan");
        emp.addEmployee(3, "deepak");
        emp.addEmployee(4, "ube");


        emp.listEmployees();
        
        System.out.println();

        emp.modifyEmployee(1, "deepu");

    
        emp.listEmployees();

        System.out.println();

        Employee foundEmployee= emp.searchEmployee(6);
        if(foundEmployee!=null){
            System.out.println("found employee : "+foundEmployee.getName());
        }
        else{
            System.out.println("not found");
        }

        System.out.println();

        emp.deleteEmployee(3);

        emp.listEmployees();

    }

}








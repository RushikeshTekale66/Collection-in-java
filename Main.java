import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Main{
    public static void main(String [] args){
        List<Employee> l1 = new ArrayList<Employee>();
        
        l1.add(new Employee("XYZ", 103, 1000));
        l1.add(new Employee("ABC", 102, 2000));
        l1.add(new Employee("MNO", 101, 4000));
        l1.add(new Employee("PQR", 104, 3000));
        
        System.out.println("Original list");
        for(Employee e : l1){
            System.out.println(e);
        }
        
        System.out.println();
        System.out.println("Sorted List");
        
        Collections.sort(l1, new IdComparator());
        for(Employee e : l1){
            System.out.println(e);
        }
    }
}


//ADD element to the list using constructor
class Employee{
    String name;
    int id;
    double salary;
    
    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    @Override
    public String toString(){
        return "Name : " + name + ", Id : " + id + ", Salary : " + salary;
    }   
}


//Comparator Interface

class IdComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2){
        return o1.id-o2.id;
    }
}
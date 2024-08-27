import java.util.Map;
import java.util.HashMap;

class Main{
    public static void main(String [] args){
        Map<Integer, Student> m = new HashMap<Integer, Student>();
        
        m.put(1, new Student("Rushikesh", 10));
        m.put(3, new Student("Rohan", 20));
        m.put(2, new Student("Tushar", 30));
        
        m.forEach((k, v)->{
            System.out.println(k + ", " +  v);
        });
    }
}


// Add object to the Map
class Student{
    String name;
    int id;
    
    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }
    
    public String toString(){
        return "Name : " + name + " & Id : " + id;
    }
}
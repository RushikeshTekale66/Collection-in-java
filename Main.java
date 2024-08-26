
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main
{
	public static void main(String[] args) {
		List <Vehicle> l1 = new ArrayList<Vehicle>();
		
		l1.add(new Vehicle("BMW", 2332, 10000));
		l1.add(new Vehicle("Oddi", 3344, 20000));
		l1.add(new Vehicle("Mercidies", 4444, 40000));
		l1.add(new Vehicle("Range rover", 5555, 30000));
		
		System.out.println("Original List");
		for(Vehicle v : l1){
		    System.out.println(v);
		}
		
		Collections.sort(l1);
		System.out.println();
		
		System.out.println("After sorting");
		for(Vehicle v : l1){
		    System.out.println(v);
		}
	}
}



class Vehicle implements Comparable<Vehicle>{
    private String name;
    private int vno;
    private int price;
    
    public Vehicle(String name, int vno, int price){
        this.name = name;
        this.vno= vno;
        this.price = price;
    }

    
    @Override
    public String toString(){
        return "Vehicle [Name : " + name + ", Vno : " + vno + ", price : " + price ;
    }
    
    @Override
    public int compareTo(Vehicle o){
        if(this.price==o.price){
            return 0;
        }
        else if(this.price>o.price){
            return 1;
        }
        else{
            return -1;
        }
    }
}
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Main
{
	public static void main(String[] args) {
		Bank b = new Bank();
		b.insert();
		b.display();
	}
}


class Bank{
    private String name;
    private int balance;
    private int age;
    private String address;
    
    List <Bank> al = new ArrayList<Bank>();
    Scanner sc = new Scanner(System.in);
    
    public Bank (String name, int balance, int age, String address){
        this.name = name;
        this.balance = balance;
        this.age = age;
        this.address = address;
    }
    
    public Bank(){}
    
    public String toString(){
        return "Name : " + name + ", Age : " + age + ", Balance : " + balance + ", Address " + address;
    }
    
    public void insert(){
        System.out.println("Enter the customer you want to add ");
        int customer = sc.nextInt();
        
        for(int i=0; i<customer; i++){
            System.out.println("Enter the customer name");
            String n = sc.next();
            System.out.println("Enter the balance ");
            int b = sc.nextInt();
            System.out.println("Enter the age of customer ");
            int a = sc.nextInt();
            System.out.println("Enter the address of customer");
            String ad = sc.next();
            
            al.add(new Bank(n, b, a, ad));
        }
        
        System.out.println("Customer information before the sorting");
        Iterator it = al.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
    public void display(){
        for(int i=0; i<al.size(); i++){
            for(int j=i+1; j<al.size(); j++){
                if(al.get(i).balance > al.get(j).balance){
                    Bank temp = al.get(i);
                    al.set(i, al.get(j));
                    al.set(j, temp);
                }
            }
        }
        
        System.out.println("Customer information after sorting");
        Iterator it = al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
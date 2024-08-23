import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Main{
	
	public static void main(String [] args) {
		Student st = new Student();
		st.insert();
		st.sort();
		st.display();
	}
}


 class Student {
	private String name;
	private int id;
	private double marks;
	
	List <Student> l1 = new ArrayList<Student>();
	
	public Student(String name, int id, double marks) {
		this.name = name;
		this.id = id;
		this.marks = marks;
	}
	
	public Student() {};
	
	public void insert() {
		l1.add(new Student("Rushikesh", 101, 81.70));
		l1.add(new Student("Tushar", 104, 89.90));
		l1.add(new Student("Rohan", 103, 78.90));
		l1.add(new Student("Swara", 102, 98.90));
		
		Iterator i = l1.iterator();
		System.out.println("Before sorting........................................");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
	@Override
	public String toString() {
		return "Student Name " + name + " id " + id + " Marks " + marks;
	}
	
	public void sort() {
		for(int i=0; i<l1.size(); i++) {
			for(int j=0; j<l1.size(); j++) {
				if(l1.get(i).marks > l1.get(j).marks) {
					Student temp = l1.get(i);
					l1.set(i, l1.get(j));
					l1.set(j, temp);
				}
			}
		}
	}
	
	public void display() {
		System.out.println("After sorting...................................");
		Iterator i = l1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}

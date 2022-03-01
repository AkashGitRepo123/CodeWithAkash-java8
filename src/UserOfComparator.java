import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UserOfComparator {

	public static void main(String[] args) {
		List<Employee> listEmpl = Arrays.asList(new Employee("SAK", "KA", 39), 
				new Employee("AKS", "SKA", 19),
				new Employee("LAKS", "ANSKA", 29));
		
		System.out.println(listEmpl);
		// Old way of doing
		/*
		 * Collections.sort(listEmpl, new Comparator<Employee>() {
		 * 
		 * @Override public int compare(Employee o1, Employee o2) { return o1.getAge() -
		 * o2.getAge(); } });
		 */
		
		// using lamda function
		
		
		  Comparator<Employee> comparator = Comparator.comparing(e -> e.getAge());
		  Collections.sort(listEmpl, comparator);
		  
		  System.out.println(" sorted by Age " + listEmpl);
		  //or
		  
		  Comparator<Employee> comparator2 = (e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName()); 
				  
		  Collections.sort(listEmpl, comparator2);
		 
		  System.out.println(" Sorted by First Name " + listEmpl);
		  
		// using Method reference
		  
		   Comparator<Employee> comparator3 = Comparator.comparing(Employee :: getSecondName);
		  
		   		Collections.sort(listEmpl, comparator3.thenComparing(Employee:: getAge, Comparator.reverseOrder()));
			 
			  System.out.println(" Sorted by Last Name " + listEmpl);
			 
		// sorting using list.sort
			  
			  listEmpl.sort(Comparator.comparing(e -> e.getAge()));
		
	}

}


class Employee {
	
	private String firstName;
	private String secondName;
	private int Age;
	
	public Employee(String firstName, String secondName, int age) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		Age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", secondName=" + secondName + ", Age=" + Age + "]";
	}
	
}
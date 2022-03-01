package Java8.realtimequeries.solutions;

import java.util.HashMap;
import java.util.Map;

public class Person {

	public static void main (String ar[]) {
	Person1 p1 = new Person1("firstName1", "lastName1");
	Person1 p2 = new Person1("firstName2", "lastName2");
	
	Map<Person1, String> map1 = new HashMap<Person1, String>();
	
	
	map1.put(p1, "first person added");
	map1.put(p2, "second person added");
	map1.put(new Person1("firstName1", "lastName1"), "Override first person");
	System.out.println(map1.size());
	System.out.println(map1.get(new Person1("firstName1", "lastName1")));
	
	/*
	 * Object [] myObject = {new Integer(12), new Boolean(true)};
	 * Arrays.sort(myObject);
	 */
	
	Car<String> cS = new Car<>();
	
	Car c =cS;
	
	
	}
}


class Person1 {
	String firstname;
	String lastName;
	public Person1(String firstname, String lastName) {
		super();
		this.firstname = firstname;
		this.lastName = lastName;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}
/*
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person1 other = (Person1) obj;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
*/
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}

class Car<T>
{
void set(T t) {
	
}	
}
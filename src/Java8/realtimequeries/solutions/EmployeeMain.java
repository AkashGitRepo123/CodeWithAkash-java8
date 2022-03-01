package Java8.realtimequeries.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		
		// https://harshitjain.home.blog/2019/06/28/solving-real-time-queries-using-java-8-features-employee-management-system/
		
		List<Employee> employeeList = new ArrayList<Employee>();
        
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		
		// 1) How Many Female and Male employees are in the Org
		
		/*
		 * long maleCount =
		 * employeeList.stream().filter(e->e.getGender().equals("Male")).count();
		 * 
		 * System.out.println("Number of Male employees: "+ maleCount);
		 * 
		 * 
		 * long femaleCount =
		 * employeeList.stream().filter(e->e.getGender().equals("Female")).count();
		 * 
		 * System.out.println("Number of Female employees: "+ femaleCount);
		 */
		
		
		// 2) Print the name of all departments in the org
		
		/*
		 * List<String> collect =
		 * employeeList.stream().map(e->e.getDepartment()).distinct().collect(Collectors
		 * .toList());
		 * 
		 * System.out.println("Departments " + collect);
		 */

		// 3) What is the avg age of Male and Female Employees
		
		/*
		 * Map<String, List<Employee>> collect =
		 * employeeList.stream().collect(Collectors.groupingBy(Employee::getGender));
		 * 
		 * collect.forEach((a,b) -> System.out.println(a + " " + b));
		 */
		
		/*
		 * Map<String, Double> avgAgeOfMaleAndFemaleEmployees =
		 * employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,
		 * Collectors.averagingInt(Employee::getAge)));
		 * 
		 * 
		 * 
		 * System.out.println(avgAgeOfMaleAndFemaleEmployees);
		 */
		
		// 4 ) Get the details of highest paid employee in org
		
		/*
		 * Comparator<Employee> comparing = Comparator.comparing(Employee::getSalary);
		 * 
		 * Optional<Employee> collect =
		 * employeeList.stream().collect(Collectors.maxBy(comparing));
		 * 
		 * System.out.println(collect.get());
		 * 
		 */
		
		
		// 5) Get the name of the Employees who joined after 2015
		
		/*
		 * List<Employee> collect =
		 * employeeList.stream().filter(e->e.getYearOfJoining()>=
		 * 2015).collect(Collectors.toList());
		 * 
		 * System.out.println(collect);
		 */
		
		// 6) Count the number of emp of each dept
		
		/*
		 * Map<String, Long> collect =
		 * employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment ,
		 * Collectors.counting()));
		 * 
		 * System.out.println(collect);
		 */
		
		
		// 7) what is the average salary of each dept
		
		/*
		 * Map<String, Double> collect =
		 * employeeList.stream().collect(Collectors.groupingBy(Employee::,
		 * Collectors.averagingDouble(Employee::getSalary)));
		 * 
		 * System.out.println(collect);
		 */
		
		// 8) Get the details of youngest male employee in the product development dept
		
		/*
		 * Optional<Employee> youngestEmp =
		 * employeeList.stream().filter(e->e.getDepartment().
		 * equalsIgnoreCase("Product Development") &&
		 * e.getGender().equals("Male")).collect(Collectors.minBy(Comparator.comparing(
		 * Employee::getAge)));
		 * 
		 * System.out.println(youngestEmp.get());
		 */
		
		// 9) Who has the most working experience in the org
		
		
		/*
		 * Employee employee =
		 * employeeList.stream().min(Comparator.comparing(Employee::getYearOfJoining)).
		 * get();
		 * 
		 * System.out.println(employee.getName() + " joined in " +
		 * employee.getYearOfJoining());
		 */
		
		// 10) How many male and female employees are there in sales and marketing team
		
		/*
		 * Map<String, Long> collect = employeeList.stream().filter(e->
		 * e.getDepartment().equalsIgnoreCase("Sales And Marketing")).
		 * collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		 * 
		 * System.out.println(collect);
		 */
		
		// 11) what is the avg salary of male and female employees
		/*
		 * Map<String, Double> collect2 =
		 * employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,
		 * Collectors.averagingDouble(Employee::getSalary)));
		 * System.out.println(collect2);
		 */
		
		// 12) List down the name of the employees in each dept
		
		
		/*
		 * Map<String, List<Employee>> collect =
		 * employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment))
		 * ; collect.entrySet().forEach(e -> System.out.println(e.getKey() + " " +
		 * e.getValue().stream().map(empl->empl.getName()).collect(Collectors.toList()))
		 * );
		 */
				  
		// 13) What is the avg salary and total salary of whole department
				  
				
				  Double collect2 = employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		
				  System.out.println("Average salary " + collect2);
				  
				  Double collect3 = employeeList.stream().collect(Collectors.summingDouble(Employee:: getSalary));
				  
				  System.out.println("Total salary " + collect3);
	}

}

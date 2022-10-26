package ford.b2.oops.stream;

import java.time.LocalDate;
import java.util.Objects;

// User defined data type?
public class Employee implements Comparable<Employee> { // POJO class :Plain old java object

	// Data members / attributes / instance data members
	private Integer id;
	private String name;
	private Double salary;
	private LocalDate doj;

	// member methods
	public Employee() { // default constructor
//		this.id=0;
//		this.name="";
//		this.salary=0.0;
	}
	
	public static Double fetchSal(Employee e) {
		return e.getSalary();
	}

	public Employee(Integer id, String name, Double salary) { // parameterized constructor
		// validate?

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Employee(Integer id, String name, Double salary, LocalDate doj) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.doj = doj;
	}

// copy constructor
	public Employee(Employee emp) {
		super();
		this.id = emp.id;
		this.name = emp.name;
		this.salary = emp.salary;
	}

	public void newFun() {
		System.out.println("new functionality!");
	}

	// getters & setters
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return this.id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary.doubleValue();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", doj=" + doj + "]";
	}

	// check equality of 2 employee objects.

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(this.id, other.id);
	}

	// to sort employee objects by id naturally
	@Override
	public int compareTo(Employee e2) {

		return this.getId().compareTo(e2.getId());

	}

}

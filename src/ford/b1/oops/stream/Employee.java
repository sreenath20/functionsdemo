package ford.b1.oops.stream;

import java.time.LocalDate;
import java.util.Objects;

// data type / custom defined data type [developer] / user defined
public class Employee implements Comparable<Employee> { // POJO class : plain old java objects

	// data members / attributes / instance data
	private Integer id;
	private String name;
	private Double salary;
	private LocalDate doj;

	// member functions
	// a. Constructors
	public Employee() { // empty constructor

	}

	public Employee(Integer id, String name, Double salary) {
		// super();
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

	// b. getter and setters
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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
	

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	// to check equality of two employee objects
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
		if (this.getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(id, other.id);
	}



	// for natural ordering of employee by their id's
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", doj=" + doj + "]";
	}

	@Override
	public int compareTo(Employee e2) {

		return this.getId().compareTo(e2.getId());
	}
}

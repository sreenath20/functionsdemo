package ford.b2.oops;

// User defined data type?
public class Employee { // POJO class :Plain old java object
	
	// Data members / attributes / instance data members
	private Integer id=100;
	private String name;
	private Double salary;
	
	//member methods
	public Employee() { // default constructor
//		this.id=0;
//		this.name="";
//		this.salary=0.0;
	}
	
	public Employee(Integer id,String name,Double salary) { // parameterized constructor
	//validate?
		
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	public void newFun() {
		System.out.println("new functionality!");
	}

	// getters & setters
	public void setId(Integer id) {
		this.id=id;
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
		return "Employee [id=" + this.id + ", name=" + name + ", salary=" + salary + "]";
	}
	

}

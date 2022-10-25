package ford.b1.oops.collection.comparable;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	private Integer type = 0;

	public EmployeeComparator(Integer type) {
		super();
		this.type = type;
	}

	
	@Override
	public int compare(Employee e1, Employee e2) {

		switch (type) {
		case 0: // id
			return e1.getId().compareTo(e2.getId());

		case 1:// name
			return e1.getName().compareTo(e2.getName());

		case 2:// salary
			return e1.getSalary().compareTo(e2.getSalary());

		default:
			return e1.getId().compareTo(e2.getId());

		}
	}

}

package ford.b2.oops;

public class EmployeeDriver {

	public static void main(String[] args) {

		Integer data;
		// System.out.println(data);
		Employee employee = new Employee();

		System.out.println(employee.getId());
		System.out.println(employee.toString());
		employee.setId(1);
		employee.setName("Ford");
		employee.setSalary(15000.0);
		System.out.println(employee);
		employee.setSalary(25000);
		System.out.println(employee);

		Employee employee2 = new Employee(2, "name2", 2000.0);
		System.out.println(employee2);

		// CRUD
		// C create operation
		Integer intArray[] = new Integer[10];
		// array of reference variable
		Employee employees[] = new Employee[10];
		employees[0] = new Employee(3, "n3", 3000.0);
		employees[1] = new Employee(4, "n4", 4000.0);
		employees[2] = new Employee(5, "n5", 5000.0);

		// R read
		// find emp by id = 4?
		System.out.println("Print emp details of id = 4:");
		Integer findEmpId = 4;

		for (Employee emp : employees) {
			if (emp != null && emp.getId() == findEmpId) {
				System.out.println(emp);
				break;
			}
		}

		// update salary of emp id 5 by 10%
		findEmpId = 5;
		for (Employee emp : employees) {
			if (emp != null && emp.getId() == findEmpId) {
				// System.out.println(emp);
				emp.setSalary(emp.getSalary() * 1.1);
				break;
			}
		}
		// print all emps
		System.out.println("Print all details after sal hike");
		for (Employee emp : employees) {
			if (emp != null) {
				System.out.println(emp);
			}
		}

		// delete emp with id = 3
		findEmpId = 3;
		Integer index = 0;
		for (Employee emp : employees) {
			if (emp != null && emp.getId() == findEmpId) {
				employees[index] = null;
				break;
			}
			index++;
		}
		System.out.println("Emp details afetr deleting id 3");

		for (Employee emp : employees) {
			if (emp != null) {
				System.out.println(emp);
			}
		}

		System.out.println("Find emp by id =4");
		System.out.println(getEmployeeById(4, employees));
		System.out.println("Find emp by id =12");
		System.out.println(getEmployeeById(12, employees));
		System.out.println("Add new emp ");
		System.out.println(addEmployee(new Employee(6, "name 6", 6000.0), employees));

	}// end of main()

	public static Employee getEmployeeById(Integer empId, Employee employees[]) {

		Employee foundEmployee = null;
		for (Employee currentEmp : employees) {
			if (currentEmp != null && currentEmp.getId() == empId) {
				foundEmployee = currentEmp;
				break;
			}
		}
		return foundEmployee;

	}

	public static Employee addEmployee(Employee newEmployee, Employee employees[]) {

		for (Integer index = 0; index < employees.length; index++) {
			if (employees[index] == null) {
				employees[index] = newEmployee;
				return newEmployee;
			}

		}
		return null;
	}

}

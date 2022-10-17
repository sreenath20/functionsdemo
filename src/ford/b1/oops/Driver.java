package ford.b1.oops;


public class Driver {

	public static void main(String[] args) {

		int i = 10;
		Integer data = 10;
		Employee employee = new Employee();
		employee.setId(1);
		// employee.id = 100;
		employee.setName("Ford");
		employee.setSalary(1500.0);
		System.out.println(employee.toString());

		Employee employee2 = new Employee();
		employee2.setId(2);
		// employee.id = 100;
		employee2.setName("Raghu");
		employee2.setSalary(2500.0);
		System.out.println(employee2.toString());

		employee.setSalary(employee.getSalary() * 1.1);
		System.out.println(employee);
		System.out.println(employee2);
		Employee employee3 = new Employee(3, "Sesha Sai", 3500.0);
		System.out.println(employee3);

		int intArray[] = new int[10];
		Integer IntegerArray[] = new Integer[10];
		// CRUD operations on Array // C create, R read, U update , D delete

		// C create
		Employee fordEmployees[] = new Employee[10];
		fordEmployees[0] = new Employee(4, "name4", 400.0);
		fordEmployees[1] = new Employee(5, "name5", 500.0);
		fordEmployees[2] = new Employee(6, "name6", 600.0);
		// R Read
		for (int index = 0; index < 9; index++) {
			if (fordEmployees[index] != null)

				System.out.println(fordEmployees[index].toString());
			else
				break;

		}
		for (Employee emp : fordEmployees) {
			if (emp != null)
				System.out.println(emp);
			else
				break;
		}
		fordEmployees[0].setName("Vishal");
		for (Employee emp : fordEmployees) {
			if (emp != null)
				System.out.println(emp);
			else
				break;
		}

		// U update
		// increase salary by 10%
		for (Employee emp : fordEmployees) {
			if (emp != null) {
				Double currentSalary = emp.getSalary();
				Double newSalary = currentSalary + (currentSalary * 0.1);
				emp.setSalary(newSalary);

			} else
				break;
		}
		// display all emp records
		displayEmployees(fordEmployees);
		// D Delete
		// remove emp object with id = 6;

		// fordEmployees[2]=null;
		int index = 0;
		for (Employee emp : fordEmployees) {

			if (emp != null && emp.getId() == 6) {
				fordEmployees[index] = null;
			}
			index++;
		}
		displayEmployees(fordEmployees);
		System.out.println("Find emp by id =5");
		System.out.println(getEmployeeById(5,fordEmployees));
		System.out.println("Find emp by id =10");
		System.out.println(getEmployeeById(10,fordEmployees));

	}

	public static void displayEmployees(Employee emps[]) {
		System.out.println("Display Employees");
		for (Employee emp : emps) {
			if (emp != null)
				System.out.println(emp);
			else
				break;
		}
	}

	public static Employee getEmployeeById(Integer findEmpId, Employee employees[]) {

		Employee foundEmp = null;

		for (Employee currentEmp : employees) {
			if (currentEmp !=null && currentEmp.getId() == findEmpId) {
				foundEmp = currentEmp;
			}

		}
		return foundEmp;
	}

}

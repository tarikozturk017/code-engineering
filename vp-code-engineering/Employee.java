public class Employee extends Person {

	Department dept;
	private String employeeID;
	private String role;

	public static Employee createEmployee() {
		return new Employee();
	}

}
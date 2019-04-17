package homework;

class Main
{
  
	public static void main(String[] args) {
		Employee obj1 = new Employee();
		output(obj1);
		Employee obj2 = new Employee("Joe", "Smith", 12345, "01/01/1970", 35000);
		output(obj2);
	}

	static void output(Employee obj) {

		System.out.println(obj.name + " " + obj.lastName + " " + obj.employeeId + " " + obj.startDate + " " + obj.salary);

	}	
}
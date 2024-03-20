package EP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PayRoll payrollSystem = new PayRoll();

        FullTimeEmployee emp1 = new FullTimeEmployee("John Doe", 101, 5000.0);
        PartTimeEmployee emp2 = new PartTimeEmployee("Jane Smith", 102, 30, 15.0);

        payrollSystem.AddEmployee(emp1);
        payrollSystem.AddEmployee(emp2);

        System.out.println("Initial Employee Details:");
        payrollSystem.displayEmployee();

        System.out.println("\nRemoving Employee...");
        payrollSystem.RemoveEmployee(101);

        System.out.println("\nRemaining Employee Details:");
        payrollSystem.displayEmployee();

	}

}

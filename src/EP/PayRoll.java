package EP;

import java.util.ArrayList;

public class PayRoll {
	
	private ArrayList<Employee>employeeList;
	
	
	public PayRoll()
	{
		employeeList=new ArrayList<>();
	}
	
	public void AddEmployee(Employee employee)
	{
		employeeList.add(employee);
	}
	
	
	public void RemoveEmployee(int id)
	{
		Employee removeEmployee=null;
		
		for(Employee employee:employeeList)
		{
			if(employee.getId()==id)
			{
				removeEmployee=employee;
				break;
			}
			
			if(removeEmployee!=null) {
				employeeList.remove(removeEmployee);
			}
		}
	}
	
	public void displayEmployee() {
		for(Employee employee:employeeList)
			System.out.println(employee);
	}
}

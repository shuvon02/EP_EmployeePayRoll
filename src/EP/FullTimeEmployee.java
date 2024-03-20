package EP;

public class FullTimeEmployee extends Employee {

	private double motnhlysalary;
	
	public FullTimeEmployee(String name, int id,double monthlysalary) {
		super(name, id);
		// TODO Auto-generated constructor stub
		this.motnhlysalary=monthlysalary;
		
	}

	@Override
	public double CalculateSalary() {
		// TODO Auto-generated method stub
		return motnhlysalary;
	}
	

}

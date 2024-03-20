package EP;

public class PartTimeEmployee extends Employee {

	private int hourswork;
	private double hourlyrate;
	public PartTimeEmployee(String name, int id, int hourswork, double hourlyrate) {
		super(name, id);
		this.hourswork = hourswork;
		this.hourlyrate = hourlyrate;
	}
	@Override
	public double CalculateSalary() {
		// TODO Auto-generated method stub
		return (double)hourswork*hourlyrate ;
	}
	
	
	
}

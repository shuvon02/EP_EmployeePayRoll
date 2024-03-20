package EP;

abstract class Employee {
	
	private String name;
	private int id;
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public abstract double CalculateSalary();
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id +"Salary="+CalculateSalary()+"]";
	}
	
	
	
	
}


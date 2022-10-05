package p4;

public class Employee {
	private String name;
	private int id;	
	private  String Salary;
	
	public Employee() {
		super();
	}

	public Employee(String name, int id, String salary) {
		super();
		this.name = name;
		this.id = id;
		Salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSalary() {
		return Salary;
	}

	public void setSalary(String salary) {
		Salary = salary;
	}
@Override
public String toString(){
	return "Employee[name="  +name+",id="  +id+",Salary="  +Salary+"]";
	

}

}

package p4;

public class Accountant extends Employee {
	
	String filename;
	
	public Accountant() {
		super();
	}

	public Accountant(String name, int id, String salary) {
		super(name, id, salary);
		// TODO Auto-generated constructor stub
	}

	public Accountant(String filename) {
		super();
		this.filename = filename;
	}
	
	public Accountant(String name,int id, String Salary,String filename) {
		super(name,id,Salary);
		this.filename=filename;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
	public void workingOnFile() {
		System.out.println("working on file"+filename);
	}

}

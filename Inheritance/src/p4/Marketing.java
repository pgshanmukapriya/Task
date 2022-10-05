package p4;

public class Marketing extends Employee {
	private String emailId;
	
	public Marketing() {
		super();
	}

	public Marketing(String name, int id, String salary) {
		super(name, id, salary);
		// TODO Auto-generated constructor stub
	}

	public Marketing(String emailId) {
		super();
		this.emailId = emailId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	public void workingOnemailId()
	{
		System.out.println(" working on emailId "+emailId);
	}

	
	@Override
	public String toString() {
		return "emailId[emailId="  +emailId+"]";
	}

}

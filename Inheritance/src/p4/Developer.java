package p4;

public class Developer extends Employee {
	
	private Project project;
	
	public Developer() {
		super();
	}

	public Developer(String name, int id, String salary, Project p) {
		super(name, id, salary);
		this.project=project;
		
		// TODO Auto-generated constructor stub
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
	

}

package ref;

public class Employee {
	private String empName;
	private Department dept;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public Employee(String empName, Department dept) {
		super();
		this.empName = empName;
		this.dept = dept;
	}
	
	
}

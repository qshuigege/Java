package ref;

public class RefTest {
	public static void main(String[] args) {
		Department deptA = new Department("deptA");
		Department deptB = new Department("deptB");
		Employee empA = new Employee("empA", deptA);
		Employee empB = new Employee("empB", deptB);
		empB.setDept(empA.getDept());
		empB.getDept().setDeptName("fff");
		System.out.println(empA.getDept().getDeptName());
	}
}

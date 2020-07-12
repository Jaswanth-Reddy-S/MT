package assignment2;

public class Employee27 {
	private int empId;
	private String empName;
	private String empDesig;
	private String empDept;
	public Employee27(int empId, String empName, String empDesig, String empDept) {
		setEmpId(empId);
		setEmpName(empName);
		setEmpDesig(empDesig);
		setEmpDept(empDept);
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		if(empName!=null)
			this.empName = empName;
		else
			System.out.println("Sorry! The name can't be Null");
	}
	public String getEmpDesig() {
		return empDesig;
	}
	public void setEmpDesig(String empDesig) {
		if(empDesig=="developer"||empDesig=="tester"||empDesig=="Lead"||empDesig=="manager")
			this.empDesig = empDesig;
		else
			System.out.println("Invalid designation");
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		if(empDept=="TTH" || empDept=="RCM" ||empDept=="Digital" || empDept=="DevOps")
			this.empDept = empDept;
		else
			System.out.println("Invalid Dept");
	}
	public static void main(String[] args) {
		Employee27 emp = new Employee27(1230,null,"developer","random");
	}
}

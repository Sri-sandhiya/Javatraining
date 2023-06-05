package inheritance;
/**
 * To create employee and manager class and use inheritance
 * @author sandhiyasri
 * @since  05/06/23
 */
//base class employee
class Employee{
	int empId;
	String empName;
	
	public void setData(int empId,String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	public void getData() {
		System.out.println("employee Id : " +empId + "|" +"Employee name : " +empName+ "|");
	}
	
}

//derived class manager

class Manager extends Employee{
	String empDept;
	
	public void setDept(String empDept) {
		this.empDept = empDept;
	}
	public void getDept() {
		System.out.println("employee depart :"+ empDept);
	}
}

public class SingleInherit {
	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.setData(123,"mark");
		manager.setDept("QA");
		manager.getData();
		manager.getDept();
		
	}


}
